package cn.signit.sdk.pojo.webhook.response;

import java.util.List;

/**
 * 信封成功完成事件webhook信息具体数据.
 * 
 * @since 2.7.5
 */
public class EnvelopeCompletedSucceed extends EnvelopeCompleted {

    private ThirdPartFieldsMetadata thirdPartFieldsMetadata;

    /**
     * 信封成功完成事件回传第三方数据数据.
     *
     * @since 2.7.8
     */
    public static class ThirdPartFieldsMetadata {
        private List<ThirdPartField> thirdPartFields ;

        public List<ThirdPartField> getThirdPartFields() {
            return thirdPartFields;
        }

        public void setThirdPartFields(List<ThirdPartField> thirdPartFields) {
            this.thirdPartFields = thirdPartFields;
        }

        /**
         * 信封完成事件回传第三方预填数据数据.
         *
         * @since 2.7.8
         */
        public static class ThirdPartField{
            //第三方数据的标识，用来与formid关联
            private String tpfCode;
            //第三方数据名称
            private String tpfName;
            //第三方数据值
            private Object tpfValue;
            //第三方数据描述
            private String tpfDescription;
            //第三方数据值
            private Integer tpfSequence;

            public String getTpfCode() {
                return tpfCode;
            }

            public void setTpfCode(String tpfCode) {
                this.tpfCode = tpfCode;
            }

            public String getTpfName() {
                return tpfName;
            }

            public void setTpfName(String tpfName) {
                this.tpfName = tpfName;
            }

            public Object getTpfValue() {
                return tpfValue;
            }

            public void setTpfValue(Object tpfValue) {
                this.tpfValue = tpfValue;
            }

            public String getTpfDescription() {
                return tpfDescription;
            }

            public void setTpfDescription(String tpfDescription) {
                this.tpfDescription = tpfDescription;
            }

            public Integer getTpfSequence() {
                return tpfSequence;
            }

            public void setTpfSequence(Integer tpfSequence) {
                this.tpfSequence = tpfSequence;
            }
        }
    }

    public ThirdPartFieldsMetadata getThirdPartFieldsMetadata() {
        return thirdPartFieldsMetadata;
    }

    public void setThirdPartFieldsMetadata(ThirdPartFieldsMetadata thirdPartFieldsMetadata) {
        this.thirdPartFieldsMetadata = thirdPartFieldsMetadata;
    }
}
