package cn.signit.sdk.pojo;

import cn.signit.sdk.pojo.Signer.Position.KeywordPosition;
import cn.signit.sdk.pojo.Signer.Position.RectanglePosition;
import cn.signit.sdk.pojo.Signer.Position.RectanglePosition.RectanglePositionBuilder;
import cn.signit.sdk.type.Direction;

/**
 * 快捷会签的签名区域，所有人的签名都会放到这个签名区域中；可以通过关键定位（keywordPosition）或者直接指定区域（rectanglePosition）；rectanglePosition优于keywordPosition
 * 
 * 
 * @since 2.5.0
 */
public class CountersignaturePosition {
    private RectanglePosition rectanglePosition;
    private KeywordPosition keywordPosition;
    private Float rowSpace;
    private Float columnSpace;

    public RectanglePosition getRectanglePosition() {
        return rectanglePosition;
    }

    public void setRectanglePosition(RectanglePosition rectanglePosition) {
        this.rectanglePosition = rectanglePosition;
    }

    public KeywordPosition getKeywordPosition() {
        return keywordPosition;
    }

    public void setKeywordPosition(KeywordPosition keywordPosition) {
        this.keywordPosition = keywordPosition;
    }

    public Float getRowSpace() {
        return rowSpace;
    }

    public void setRowSpace(Float rowSpace) {
        this.rowSpace = rowSpace;
    }

    public Float getColumnSpace() {
        return columnSpace;
    }

    public void setColumnSpace(Float columnSpace) {
        this.columnSpace = columnSpace;
    }

    public CountersignaturePosition() {
        super();
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}建造器
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 有参构造方法
     * 
     * @param rectanglePosition
     *            直接指定的矩形区域位置
     * @param keywordPosition
     *            关键字定位签名区域
     * @param rowSpace
     *            上下两排签名的间距
     * @param columnSpace
     *            左右两列签名的间距
     */
    public CountersignaturePosition(RectanglePosition rectanglePosition, KeywordPosition keywordPosition,
            Float rowSpace, Float columnSpace) {
        super();
        this.rectanglePosition = rectanglePosition;
        this.keywordPosition = keywordPosition;
        this.rowSpace = rowSpace;
        this.columnSpace = columnSpace;
    }

    /**
     * 快捷会签的签名区域位置的 建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CountersignaturePosition> {
        private RectanglePosition rectanglePosition;
        private KeywordPosition keywordPosition;
        private Float rowSpace;
        private Float columnSpace;

        /**
         * @param rectanglePosition
         *            直接指定的矩形区域位置
         * @since 2.5.0
         * @return 快捷会签的签名区域位置的 建造器
         */
        public Builder rectanglePosition(RectanglePosition rectanglePosition) {
            this.rectanglePosition = rectanglePosition;
            return this;
        }

        /**
         * @param rectanglePositionBuilder
         *            直接指定的矩形区域位置建造器
         *            {@link cn.signit.sdk.pojo.Signer.Position.RectanglePosition.RectanglePositionBuilder}
         * @since 2.5.0
         * @return 快捷会签的签名区域位置的 建造器
         */
        public Builder rectanglePosition(RectanglePositionBuilder rectanglePositionBuilder) {
            this.rectanglePosition = rectanglePositionBuilder.build();
            return this;
        }

        /**
         * @param keywordPositionBuilder
         *            关键字定位签名区域的建造器
         *            {@link cn.signit.sdk.pojo.CountersignaturePosition.KeywordPositionBuilder}
         * @since 2.5.0
         * @return 快捷会签的签名区域位置的 建造器
         */
        public Builder keywordPosition(KeywordPositionBuilder keywordPositionBuilder) {
            this.keywordPosition = keywordPositionBuilder.build();
            return this;
        }

        /**
         * @param rowSpace
         *            上下两排签名的间距
         * @since 2.5.0
         * @return 快捷会签的签名区域位置的 建造器
         */
        public Builder rowSpace(Float rowSpace) {
            this.rowSpace = rowSpace;
            return this;
        }

        /**
         * @param columnSpace
         *            左右两列签名的间距
         * @since 2.5.0
         * @return 快捷会签的签名区域位置的 建造器
         */
        public Builder columnSpace(Float columnSpace) {
            this.columnSpace = columnSpace;
            return this;
        }

        /**
         * @since 2.5.0
         * @return 一个新的{@link CountersignaturePosition}对象
         */
        @Override
        public CountersignaturePosition build() {
            return new CountersignaturePosition(rectanglePosition, keywordPosition, rowSpace, columnSpace);
        }

    }

    /**
     * 快捷会签中的通过关键字确定签名区域的建造器
     * 
     * 
     * @since 2.5.0
     */
    public static class KeywordPositionBuilder {
        private Float width;
        private Float height;
        private Direction direction;
        private String keyword;
        private Float yOffset;
        private Float xOffset;
        private Float scale;
        private String pages;
        private Integer index;

        /**
         * @param width
         *            签名区域的宽度（单位：px）
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder width(Float width) {
            this.width = width;
            return this;
        }

        /**
         * @param direction
         *            偏移方向；默认值：RIGHT
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder direction(Direction direction) {
            this.direction = direction;
            return this;
        }

        /**
         * @param height
         *            签名区域的高度（单位：px）
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder height(Float height) {
            this.height = height;
            return this;
        }

        /**
         * @param keyword
         *            关键字
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * @param yOffset
         *            签名区域在横轴方向偏移量，大于0向右移动，小于0向左移动（单位：px）
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder yOffset(Float yOffset) {
            this.yOffset = yOffset;
            return this;
        }

        /**
         * @param xOffset
         *            签名区域在纵轴方向偏移量，大于0向下移动，小于0向上移动（单位：px）
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder xOffset(Float xOffset) {
            this.xOffset = xOffset;
            return this;
        }

        /**
         * @param scale
         *            签名区域相对于当前页面的缩放比例
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder scale(Float scale) {
            this.scale = scale;
            return this;
        }

        /**
         * @param pages
         *            关键字需要搜索的页数。支持'all','first','last','odd','even','1','1-5','1,2,3,5','(0,5]','[1,5]','(0,5)'这些页数的表示方式
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder pages(String pages) {
            this.pages = pages;
            return this;
        }

        /**
         * @param index
         *            如果关键字所在页数存在多个相同关键字，可以指定关键字的索引（关键字从索引从0开始）,即指定使用第几个关键字；如果期望所有的关键字，则不需要设置该参数
         * @return 快捷会签中的关键字定位签名区域的建造器
         * 
         * @since 2.5.0
         */
        public KeywordPositionBuilder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * @return 一个新的{@link KeywordPosition}对象
         * @since 2.5.0
         */
        public KeywordPosition build() {
            return new KeywordPosition(width, 0.0f, height, 0.0f, direction, 0.0f, 0.0f, keyword, scale, pages, xOffset,
                    yOffset, index);
        }
    }
}
