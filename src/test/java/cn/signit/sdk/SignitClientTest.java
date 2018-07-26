package cn.signit.sdk;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
import cn.signit.sdk.pojo.Signer.SignerInfo;
import cn.signit.sdk.pojo.Signer.Position.KeywordPosition;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.Direction;

public class SignitClientTest {
    @Test
    public void quickSign() {
        Authentication auth = new Authentication();
        auth.setAppId("b087888987ba4a7275706d45aafd6fdc60813f82").setSecretKey("skfafec4f0e8b78b05b87ccf12c9d5fb7c")
                .setDeveloperId("WSID_DEVE_00000164cb192d7d00232444a7d90001").setAccessTokenType("client_credentials");
        SignitClient client = new SignitClient(auth);
        FileData fileData = new FileData("https://www.jibbering.com/2002/4/test.txt", null);
        SealData sealData = SealData.builder().withUrl("http://img.go007.com/2016/03/12/2776ec64f0014006_1.jpg")
                .withName("myseal").build();
        Data data = Data.build().withSealData(sealData).build();
        KeywordPosition keywordPosition = KeywordPosition.builder().withKeyword("page").withRelativeWidthRatio(1.0f)
                .withRelativeHeightRatio(1.0f).withRelativeOffsetRatio(0.2f).withDirection(Direction.RIGHT)
                .withScale(1.0f).withPages("all").build();
        Position position = Position.builder().withKeywordPosition(keywordPosition).build();
        SignerInfo signerInfo = SignerInfo.builder().withContact("12345678@qq.com").withName("张三")
                .withOrgnizationName("宇宙超级无敌有限公司").withIdCardNo("61112197603012136").withLocation("北京市朝阳区")
                .withReason("公司合作").build();
        Signer signer1 = Signer.builder().withData(data).withPosition(position).withSequence(1)
                .withSignerInfo(null).build();
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
