package cn.signit.sdk;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
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
        // WSID_DEVE_00000164cb192d7d00232444a7d90001
        File f = new File("E:/quicksign_with_field.pdf");
        Authentication auth = new Authentication();
        byte[] files = IOUtils.toByteArray(new FileInputStream(f));
        String signDoc = Base64.encodeBase64String(files);
        auth.setAppId("e220908f789010fb125b6843f12b303842b9db6b").setSecretKey("sk61fc737afe5d5fa1a5f56a32a4265940");
        SignitClient client = new SignitClient(auth);
        FileData fileData = new FileData();
        fileData.setBase64(signDoc);
//        fileData.setUrl("https://www.jibbering.com/2002/4/test.txt");
        String sealbase64 = Base64
                .encodeBase64String(IOUtils.toByteArray(new FileInputStream(new File("E:/seal.jpg"))));
        SealData sealData = SealData.builder().withBase64(sealbase64).withName("myseal").build();
        Data data = Data.build().withSealData(sealData).build();
        KeywordPosition keywordPosition = KeywordPosition.builder().withKeyword("page").withRelativeWidthRatio(1.0f)
                .withRelativeHeightRatio(1.0f).withRelativeOffsetRatio(0.2f).withDirection(Direction.RIGHT)
                .withScale(1.0f).withPages("all").build();
        Position position = Position.builder().withFieldName("test_quick_sign").build();
        SignerInfo signerInfo = SignerInfo.builder().withContact("12345678@qq.com").withName("张三")
                .withOrgnizationName("宇宙超级无敌有限公司").withIdCardNo("61112197603012136").withLocation("北京市朝阳区")
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
