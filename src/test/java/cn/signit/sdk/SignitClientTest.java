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
//    @Test
    public void quickSign() throws FileNotFoundException, IOException {
        Authentication auth = new Authentication();
        auth.setAppId("appid").setSecretKey("secretKey");
        SignitClient client = new SignitClient(auth);
        FileData fileData = new FileData();
        fileData.setUrl("https://www.jibbering.com/2002/4/test.txt");
        SealData sealData = SealData.builder().withUrl("http://img.go007.com/2016/03/12/2776ec64f0014006_1.jpg").withName("myseal").build();
        Data data = Data.build().withSealData(sealData).build();
        KeywordPosition keywordPosition = KeywordPosition.builder().withKeyword("page").withRelativeWidthRatio(1.0f)
                .withRelativeHeightRatio(1.0f).withRelativeOffsetRatio(0.2f).withDirection(Direction.RIGHT)
                .withScale(1.0f).withPages("all").build();
        Position position = Position.builder().withKeywordPosition(keywordPosition).build();
        SignerInfo signerInfo = SignerInfo.builder().withContact("12345678@qq.com").withName("张三")
                .withOrgnizationName("宇宙超级无敌有限公司").withIdCardNo("61112190005012136").withLocation("北京市朝阳区")
                .withReason("公司合作").build();
        Signer signer1 = Signer.builder().withData(data).withPosition(position).withSequence(1)
                .withSignerInfo(signerInfo).build();
        List<Signer> signDetails = new ArrayList<Signer>();
        signDetails.add(signer1);
        SignatureRequest request = SignatureRequest.builder().withAcceptDataType(AcceptDataType.URL)
                .withFileData(fileData).withSignDetails(signDetails).build();
        System.out.println(JSON.toJSONString(request, SerializerFeature.PrettyFormat));
        try {
            SignatureResponse response = client.sendSignatureRequest(request);
            System.out.println(response.getCode());
            assertTrue("100550001".equals(response.getCode()));
        } catch (SignitException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
