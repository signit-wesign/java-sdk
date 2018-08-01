package cn.signit.sdk;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.signit.sdk.http.Authentication;
import cn.signit.sdk.pojo.FileData;
import cn.signit.sdk.pojo.SealData;
import cn.signit.sdk.pojo.SignatureRequest;
import cn.signit.sdk.pojo.SignatureResponse;
import cn.signit.sdk.pojo.Signer;
import cn.signit.sdk.pojo.Signer.Data;
import cn.signit.sdk.pojo.Signer.Position;
import cn.signit.sdk.pojo.Signer.Position.KeywordPosition;
import cn.signit.sdk.pojo.Signer.SignerInfo;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.Direction;

public class SignitClientTest {
    @Test
    public void quickSign() throws FileNotFoundException, IOException {
        Authentication auth = new Authentication();
        auth.setAppId("164ea4a9c800242ac130007de41")
                .setSecretKey("sk216a33d789f165aa26d01526023d903a");
        SignitClient client = new SignitClient(auth, "http://10.10.9.222:2576");
        FileData fileData = new FileData();
        fileData.setUrl("https://zhangbo1416694870.github.io/filesystem/quicksign.txt");
        SealData sealData = SealData.builder()
                .withUrl("https://zhangbo1416694870.github.io/filesystem/zhangbo.png")
                .withName("mySignature")
                .build();
        Data data = Data.build()
                .withSealData(sealData)
                .build();
        Position position = Position.builder()
                .withKeywordPosition(
                        new KeywordPosition(null, 1.0f, null, 1.0f, Direction.RIGHT, null, 1.0f, "签字", 1.5f, "all"))
                .build();
        SignerInfo signerInfo = SignerInfo.builder()
                .withContact("12345678@qq.com")
                .withName("张三")
                .withOrgnizationName("宇宙超级无敌有限公司")
                .withIdCardNo("61112197603012136")
                .withLocation("北京市朝阳区")
                .withReason("公司合作")
                .build();
        Signer signer1 = Signer.builder()
                .withData(data)
                .withPosition(position)
                .withSequence(1)
                .withSignerInfo(signerInfo)
                .build();
        List<Signer> signDetails = new ArrayList<Signer>();
        signDetails.add(signer1);
        SignatureRequest request = SignatureRequest.builder()
                .withAcceptDataType(AcceptDataType.URL)
                .withFileData(fileData)
                .withSignDetails(signDetails)
                .build();
        System.out.println(JSON.toJSONString(request, SerializerFeature.PrettyFormat));
        try {
            SignatureResponse response = client.sendSignatureRequest(request);
            System.out.println(response.isSuccess());
        } catch (SignitException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
