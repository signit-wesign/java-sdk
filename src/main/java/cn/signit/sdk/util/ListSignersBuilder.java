/*
 * Copyright © 2018 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.signit.sdk.util;

import java.util.ArrayList;
import java.util.List;

import cn.signit.sdk.pojo.Signer;

public class ListSignersBuilder {

    public static ListSignersBuilder newBuilder() {
        return new ListSignersBuilder();
    }

    private ListSignersBuilder() {
    }

    private List<Signer> SignerList;

    public ListSignersBuilder withNewList() {
        this.SignerList = new ArrayList<Signer>();
        return this;
    }

    public ListSignersBuilder withList(List<Signer> SignerList) {
        this.SignerList = SignerList;
        return this;
    }

    public ListSignersBuilder addSigner(Signer signer) {
        this.SignerList.add(signer);
        return this;
    }

    public List<Signer> build() {
        return this.SignerList;
    }
}
