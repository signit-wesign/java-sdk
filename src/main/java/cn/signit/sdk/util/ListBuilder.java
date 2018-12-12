package cn.signit.sdk.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cn.signit.sdk.pojo.Builder;

/**
 * 
 * 根据多个Builder构建对应的数据列表.
 * 
 * @since 1.0.2
 */
public class ListBuilder {
    public static <O> List<O> buildList(List<? extends Builder<O>> builders) {
        List<O> result = new ArrayList<O>();
        for (Builder<O> builder : builders) {
            if (builder != null) {
                result.add(builder.build());
            }
        }
        return result;
    }

    public static <O> List<O> buildList(Builder<O>... builders) {
        if (builders != null) {
            return buildList(Arrays.asList(builders));
        } else {
            return Collections.emptyList();
        }
    }
}
