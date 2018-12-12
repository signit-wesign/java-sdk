package cn.signit.sdk.pojo;

public class EnterpriseBankCardInfo {
    /**
     * 银行（如：中国农业银行等）.
     *
     * @since 1.0.2
     */
    private String bank;
    /**
     * 银行支行.
     *
     * @since 1.0.2
     */
    private String bankBranch;
    /**
     * 银行卡号.
     *
     * @since 1.0.2
     */
    private String bankCardNo;
    /**
     * 地区（省，市，区/县）.
     *
     * @since 1.0.2
     */
    private String area;
    /**
     * 联行号.
     *
     * @since 1.0.2
     */
    private String unionBankNo;

    public String getBank() {
        return bank;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public String getArea() {
        return area;
    }

    public String getUnionBankNo() {
        return unionBankNo;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setUnionBankNo(String unionBankNo) {
        this.unionBankNo = unionBankNo;
    }

    public EnterpriseBankCardInfo(Builder builder) {
        this.bank = builder.bank;
        this.bankBranch = builder.bankBranch;
        this.bankCardNo = builder.bankCardNo;
        this.area = builder.area;
        this.unionBankNo = builder.unionBankNo;
    }

    public EnterpriseBankCardInfo() {

    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<EnterpriseBankCardInfo> {
        private String bank;
        private String bankBranch;
        private String bankCardNo;
        private String area;
        private String unionBankNo;

        public Builder() {

        }

        public Builder(EnterpriseBankCardInfo enterpriseBankCardInfo) {
            this.bank = enterpriseBankCardInfo.bank;
            this.bankBranch = enterpriseBankCardInfo.bankBranch;
            this.bankCardNo = enterpriseBankCardInfo.bankCardNo;
            this.area = enterpriseBankCardInfo.area;
            this.unionBankNo = enterpriseBankCardInfo.unionBankNo;
        }

        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        public Builder bankBranch(String bankBranch) {
            this.bankBranch = bankBranch;
            return this;
        }

        public Builder bankCardNo(String bankCardNo) {
            this.bankCardNo = bankCardNo;
            return this;
        }

        public Builder area(String area) {
            this.area = area;
            return this;
        }

        public Builder unionBankNo(String unionBankNo) {
            this.unionBankNo = unionBankNo;
            return this;
        }

        public EnterpriseBankCardInfo build() {
            return new EnterpriseBankCardInfo(this);
        }
    }
}
