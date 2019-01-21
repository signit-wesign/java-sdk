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
package cn.signit.sdk.pojo;

import cn.signit.sdk.pojo.Signer.Position.KeywordPosition.KeywordPositionBuilder;
import cn.signit.sdk.pojo.Signer.Position.RectanglePosition.RectanglePositionBuilder;
import cn.signit.sdk.type.Direction;

public class Signer {

    private int sequence = 1;
    private Position position;
    private Data data;
    private SignerInfo signerInfo;

    public static SignerBuilder builder() {
        return new SignerBuilder();
    }

    public static class SignerBuilder {
        private int sequence;
        private Position position;
        private Data data;
        private SignerInfo signerInfo;

        public SignerBuilder withSequence(int sequence) {
            this.sequence = sequence;
            return this;
        }

        public SignerBuilder withPosition(Position position) {
            this.position = position;
            return this;
        }

        public SignerBuilder withData(Data data) {
            this.data = data;
            return this;
        }

        public SignerBuilder withSignerInfo(SignerInfo signerInfo) {
            this.signerInfo = signerInfo;
            return this;
        }

        public Signer build() {
            return new Signer(sequence, position, data, signerInfo);
        }
    }

    public Signer() {
    }

    public Signer(int sequence, Position position, Data data, SignerInfo signerInfo) {
        this.sequence = sequence;
        this.position = position;
        this.data = data;
        this.signerInfo = signerInfo;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public SignerInfo getSignerInfo() {
        return signerInfo;
    }

    public void setSignerInfo(SignerInfo signerInfo) {
        this.signerInfo = signerInfo;
    }

    /**
     * 表单坐标位置
     * 
     * @since 1.0.0
     */
    public static class Position {
        private KeywordPosition keywordPosition;
        private RectanglePosition rectanglePosition;
        private String fieldName;

        public static PositionBuilder builder() {
            return new PositionBuilder();
        }

        /**
         * 表单坐标位置对象建造器
         * 
         * @since 1.0.0
         */
        public static class PositionBuilder {
            private KeywordPosition keywordPosition;
            private RectanglePosition rectanglePosition;
            private String fieldName;

            /**
             * 
             * @param keywordPosition
             *            利用关键字定位签名矩形框所在位置的数据对象；利用关键字进行定位
             *            {@link KeywordPosition}
             * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link PositionBuilder}
             * @since 1.0.0
             */
            public PositionBuilder withKeywordPosition(KeywordPosition keywordPosition) {
                this.keywordPosition = keywordPosition;
                return this;
            }

            /**
             * 
             * @param keywordPositionBuilder
             *            利用关键字定位签名矩形框所在位置的数据对象建造器；利用关键字进行定位{@link KeywordPosition.KeywordPositionBuilder}
             * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link PositionBuilder}
             * @since 1.0.0
             */
            public PositionBuilder withKeywordPosition(KeywordPosition.KeywordPositionBuilder keywordPositionBuilder) {
                if (keywordPositionBuilder != null) {
                    this.keywordPosition = keywordPositionBuilder.build();
                }
                return this;
            }

            /**
             * 
             * @param rectanglePosition
             *            直接设定好的签名矩形框坐标 {@link RectanglePosition}
             * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link PositionBuilder}
             * @since 1.0.0
             */
            public PositionBuilder withRectanglePosition(RectanglePosition rectanglePosition) {
                this.rectanglePosition = rectanglePosition;
                return this;
            }

            /**
             * 
             * @param rectanglePositionBuilder
             *            直接设定好的签名矩形框坐标对象建造器 {@link RectanglePositionBuilder}
             * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link PositionBuilder}
             * @since 1.0.0
             */
            public PositionBuilder withRectanglePosition(RectanglePositionBuilder rectanglePositionBuilder) {
                if (rectanglePosition != null) {
                    this.rectanglePosition = rectanglePositionBuilder.build();
                }
                return this;
            }

            /**
             * 
             * @param fieldsName
             *            签名域名称；签名文件格式需要是pdf，且签名文件中已经设置好签名域名称对应的签名域
             * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link PositionBuilder}
             * @since 1.0.0
             */
            public PositionBuilder withFieldName(String fieldsName) {
                this.fieldName = fieldsName;
                return this;
            }

            /**
             * 
             * @return 表单坐标位置对象 {@link Position}
             * @since 1.0.0
             */
            public Position build() {
                return new Position(keywordPosition, rectanglePosition, fieldName);
            }
        }

        public Position() {

        }

        public Position(KeywordPosition keywordPosition, RectanglePosition rectanglePosition, String fieldName) {
            this.keywordPosition = keywordPosition;
            this.rectanglePosition = rectanglePosition;
            this.fieldName = fieldName;
        }

        public KeywordPosition getKeywordPosition() {
            return keywordPosition;
        }

        public void setKeywordPosition(KeywordPosition keywordPosition) {
            this.keywordPosition = keywordPosition;
        }

        public RectanglePosition getRectanglePosition() {
            return rectanglePosition;
        }

        public void setRectanglePosition(RectanglePosition rectanglePosition) {
            this.rectanglePosition = rectanglePosition;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldsName) {
            this.fieldName = fieldsName;
        }

        /**
         * 利用关键字定位签名矩形框所在位置的数据对象
         * 
         * 利用关键字定位表单坐标
         * 
         * @since 1.0.0
         */
        public static class KeywordPosition {
            private Float width;
            private Float relativeWidthRatio;
            private Float height;
            private Float relativeHeightRatio;
            private Direction direction;
            private Float offset;
            private Float relativeOffsetRatio;
            private String keyword;
            private Float scale;
            private String pages;
            /**
             * x 方向的便移量 正是往右，负是往左，坐标缩放前进行最后的微调参数
             */
            private Float xOffset;
            /**
             * x 方向的便移量 正是往上，负是往下，坐标缩放前进行最后的微调参数
             */
            private Float yOffset;
            private Integer index;

            public Integer getIndex() {
                return index;
            }

            public void setIndex(Integer index) {
                this.index = index;
            }

            public KeywordPosition() {
            }

            public KeywordPosition(Float width, Float relativeWidthRatio, Float height, Float relativeHeightRatio,
                    Direction direction, Float offset, Float relativeOffsetRatio, String keyword, Float scale,
                    String pages) {
                super();
                this.width = width;
                this.relativeWidthRatio = relativeWidthRatio;
                this.height = height;
                this.relativeHeightRatio = relativeHeightRatio;
                this.direction = direction;
                this.offset = offset;
                this.relativeOffsetRatio = relativeOffsetRatio;
                this.keyword = keyword;
                this.scale = scale;
                this.pages = pages;
            }

            public KeywordPosition(Float width, Float relativeWidthRatio, Float height, Float relativeHeightRatio,
                    Direction direction, Float offset, Float relativeOffsetRatio, String keyword, Float scale,
                    String pages, Float xOffset, Float yOffset) {
                super();
                this.width = width;
                this.relativeWidthRatio = relativeWidthRatio;
                this.height = height;
                this.relativeHeightRatio = relativeHeightRatio;
                this.direction = direction;
                this.offset = offset;
                this.relativeOffsetRatio = relativeOffsetRatio;
                this.keyword = keyword;
                this.scale = scale;
                this.pages = pages;
                this.xOffset = xOffset;
                this.yOffset = yOffset;
            }

            // 2.0.0
            public KeywordPosition(Float width, Float relativeWidthRatio, Float height, Float relativeHeightRatio,
                    Direction direction, Float offset, Float relativeOffsetRatio, String keyword, Float scale,
                    String pages, Float xOffset, Float yOffset, Integer index) {
                super();
                this.width = width;
                this.relativeWidthRatio = relativeWidthRatio;
                this.height = height;
                this.relativeHeightRatio = relativeHeightRatio;
                this.direction = direction;
                this.offset = offset;
                this.relativeOffsetRatio = relativeOffsetRatio;
                this.keyword = keyword;
                this.scale = scale;
                this.pages = pages;
                this.xOffset = xOffset;
                this.yOffset = yOffset;
                this.index = index;
            }

            public static KeywordPositionBuilder builder() {
                return new KeywordPositionBuilder();
            }

            /**
             * 利用关键字定位签名矩形框所在位置的数据对象建造器
             * 
             * @since 1.0.0
             */
            public static class KeywordPositionBuilder {
                private Float width;
                private Float relativeWidthRatio;
                private Float height;
                private Float relativeHeightRatio;
                private Direction direction;
                private Float offset;
                private Float relativeOffsetRatio;
                private String keyword;
                private Float scale;
                private String pages;
                private Float xOffset;
                private Float yOffset;
                private Integer index;

                public KeywordPositionBuilder() {
                }

                /**
                 * 
                 * @param width
                 *            签名矩形框的宽度（默认为关键字宽度,单位：pt）；在易企签系统中，以左上角为坐标原点，横向为x轴，以纵向为y轴；宽度也即是签名矩形框在x方向上大小
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withWidth(Float width) {
                    this.width = width;
                    return this;
                }

                /**
                 * 
                 * @param relativeWidthRatio
                 *            签名矩形框宽度相对于关键字宽度的比率，默认为1.0；例：关键字宽度为50pt，relativeWidthRatio=2，那么签名矩形框宽度即为100pt；宽度更多介绍详见{@link KeywordPositionBuilder#withWidth(Float)}
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withRelativeWidthRatio(Float relativeWidthRatio) {
                    this.relativeWidthRatio = relativeWidthRatio;
                    return this;
                }

                /**
                 * 
                 * @param height
                 *            签名矩形框的高度（默认为关键字高度,单位：pt）;在易企签系统中，以左上角为坐标原点，横向为x轴，以纵向为y轴；高度也即是签名矩形框在y方向上大小
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withHeight(Float height) {
                    this.height = height;
                    return this;
                }

                /**
                 * 
                 * @param relativeHeightRatio
                 *            签名矩形框高度相对于关键字高度的比率，默认为1.0；例：关键字高度为50pt，relativeHeightRatio=2，那么签名矩形框高度即为100pt；高度更多介绍详见{@link KeywordPositionBuilder#withHeight(Float)}
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withRelativeHeightRatio(Float relativeHeightRatio) {
                    this.relativeHeightRatio = relativeHeightRatio;
                    return this;
                }

                /**
                 * 
                 * @param direction
                 *            偏移方向，即签名矩形框相对于关键字的方向（TOP,BOTTOM,LEFT,RIGHT,CENTER），默认为RIGHT；例：direction=TOP，则签名矩形框在关键字的上方
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withDirection(Direction direction) {
                    this.direction = direction;
                    return this;
                }

                /**
                 * 
                 * @param offset
                 *            {@code      偏移量（以签名矩形框中心为0点）配合direction使用，默认为0，单位为pt；例：经过关键字初步定位，以及设置签名矩形框的宽高后，签名矩形框位置为：（100,100）(左上角顶点)->(200,200)（右下角顶点）
                 *            ,direction=RIGHT,offset=20,那么进行偏移后，签名矩形框的坐标是
                 *            (120,100)(左上角顶点)->(220,200)（右下角顶点）}
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withOffset(Float offset) {
                    this.offset = offset;
                    return this;
                }

                /**
                 * 
                 * @param relativeOffsetRatio
                 *            在偏移方向上，相对于该方向签名矩形框大小的比率，默认为0。例：假设签名矩形框的宽度是50pt，高度为30pt，relativeOffsetRatio=2.0，direction=RIGHT，那么意味着最终偏移量为offset=100pt；同理，如果签名矩形框
                 *            宽度为50，高度为30，relativeOffsetRatio=1.3，direction=TOP，那么最终offset=39；计算后的offset使用方法详见{@link KeywordPositionBuilder#withOffset}
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withRelativeOffsetRatio(Float relativeOffsetRatio) {
                    this.relativeOffsetRatio = relativeOffsetRatio;
                    return this;
                }

                /**
                 * 
                 * @param keyword
                 *            用于定位的关键字，例如：甲方（签名）。需要注意：用于定位的关键字在文档通过wps或者adobe
                 *            reader等pdf阅读器打开后，需要能够通过鼠标圈选。例如：如果签署文档是通过图片转换后的pdf，就无法在签署文档中
                 *            获取关键字位置。
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withKeyword(String keyword) {
                    this.keyword = keyword;
                    return this;
                }

                /**
                 * 
                 * @param scale
                 *            {@code    根据关键字定位后的签名矩形框缩放比例，默认为1.0。例如根据关键字定位后，签名矩形框位置为(100,100)->(200,200),scale为2.0,那么签名矩形框位置将是(50,50)->(250,250)}
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withScale(Float scale) {
                    this.scale = scale;
                    return this;
                }

                /**
                 * 
                 * @param pages
                 *            关键字需要搜索的页数，默认为"all"。在文档中搜索关键字时，只在指定页中搜索。支持"all","first","last","odd","even","1","1-5","1,2,3,5","(0,5]","[1,5]","(0,5)"这些页数的表示方式
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 1.0.0
                 */
                public KeywordPositionBuilder withPages(String pages) {
                    this.pages = pages;
                    return this;
                }

                /**
                 * 
                 * @param xOffset
                 *            签名矩形框在x轴额外偏移量，单位为pt,默认为0
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 2.0.0
                 */
                public KeywordPositionBuilder withXOffset(Float xOffset) {
                    this.xOffset = xOffset;
                    return this;
                }

                /**
                 * 
                 * @param yOffset
                 *            签名矩形框在y轴额外偏移量，单位为pt，默认为0
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 2.0.0
                 */
                public KeywordPositionBuilder withYOffset(Float yOffset) {
                    this.yOffset = yOffset;
                    return this;
                }

                /**
                 * 
                 * @param index
                 *            如果关键字所在页数存在多个相同关键字，则需要指定关键字的索引（关键字从索引从0开始）,即指定使用第几个关键字。默认为0
                 * @return 利用关键字定位签名矩形框所在位置的数据对象建造器{@link KeywordPositionBuilder}
                 * @since 2.0.0
                 */
                public KeywordPositionBuilder withIndex(Integer index) {
                    this.index = index;
                    return this;
                }

                /**
                 * 
                 * @return 利用关键字定位签名矩形框所在位置的数据对象 {@link KeywordPosition}
                 * @since 1.0.0
                 */
                public KeywordPosition build() {
                    return new KeywordPosition(width, relativeWidthRatio, height, relativeHeightRatio, direction,
                            offset, relativeOffsetRatio, keyword, scale, pages, xOffset, yOffset, index);
                }
            }

            public Float getWidth() {
                return width;
            }

            public void setWidth(Float width) {
                this.width = width;
            }

            public Float getRelativeWidthRatio() {
                return relativeWidthRatio;
            }

            public void setRelativeWidthRatio(Float relativeWidthRatio) {
                this.relativeWidthRatio = relativeWidthRatio;
            }

            public Float getHeight() {
                return height;
            }

            public void setHeight(Float height) {
                this.height = height;
            }

            public Float getRelativeHeightRatio() {
                return relativeHeightRatio;
            }

            public void setRelativeHeightRatio(Float relativeHeightRatio) {
                this.relativeHeightRatio = relativeHeightRatio;
            }

            public Direction getDirection() {
                return direction;
            }

            public void setDirection(Direction direction) {
                this.direction = direction;
            }

            public Float getOffset() {
                return offset;
            }

            public void setOffset(Float offset) {
                this.offset = offset;
            }

            public Float getRelativeOffsetRatio() {
                return relativeOffsetRatio;
            }

            public void setRelativeOffsetRatio(Float relativeOffsetRatio) {
                this.relativeOffsetRatio = relativeOffsetRatio;
            }

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public Float getScale() {
                return scale;
            }

            public void setScale(Float scale) {
                this.scale = scale;
            }

            public String getPages() {
                return pages;
            }

            public void setPages(String pages) {
                this.pages = pages;
            }

            public Float getxOffset() {
                return xOffset;
            }

            public void setxOffset(Float xOffset) {
                this.xOffset = xOffset;
            }

            public Float getyOffset() {
                return yOffset;
            }

            public void setyOffset(Float yOffset) {
                this.yOffset = yOffset;
            }

        }

        /**
         * 签名矩形框坐标；设置小技巧：针对pdf的文档，在windows（96DPI）中：ulx,uly：使用截图工具从文档左上角顶点拉到签名框右上角，得到截图大小，然后*0.75，对lrx和lry同理
         * 
         * @since 1.0.0
         */
        public static class RectanglePosition {
            private Float lrx;
            private Float lry;
            private Float ulx;
            private Float uly;
            private Float scale;
            private Integer page;

            public static RectanglePositionBuilder builder() {
                return new RectanglePositionBuilder();
            };

            public RectanglePosition() {
            }

            public RectanglePosition(Float lrx, Float lry, Float ulx, Float uly, Float scale, Integer page) {
                this.lrx = lrx;
                this.lry = lry;
                this.ulx = ulx;
                this.uly = uly;
                this.scale = scale;
                this.page = page;
            }

            /**
             * 签名矩形框坐标对象建造器
             * 
             * @since 2.0.0
             */
            public static class RectanglePositionBuilder {
                private Float lrx;
                private Float lry;
                private Float ulx;
                private Float uly;
                private Float scale;
                private Integer page;

                public RectanglePositionBuilder() {
                }

                /**
                 * 以左上角为原点，横向为x轴，纵向为y轴
                 * 
                 * @param lrx
                 *            矩形框右下角横坐标(单位：pt)
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withLrx(Float lrx) {
                    this.lrx = lrx;
                    return this;
                }

                @Deprecated
                public RectanglePositionBuilder withLyx(Float lry) {
                    this.lry = lry;
                    return this;
                }

                /**
                 * 以左上角为原点，横向为x轴，纵向为y轴
                 * 
                 * @param lry
                 *            矩形框右下角纵坐标(单位：pt)
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withLry(Float lry) {
                    this.lry = lry;
                    return this;
                }

                /**
                 * 以左上角为原点，横向为x轴，纵向为y轴
                 * 
                 * @param ulx
                 *            矩形框左上角横坐标(单位：pt)
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withUlx(Float ulx) {
                    this.ulx = ulx;
                    return this;
                }

                /**
                 * 以左上角为原点，横向为x轴，纵向为y轴
                 * 
                 * @param uly
                 *            矩形框左上角纵坐标(单位：pt)
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withUly(Float uly) {
                    this.uly = uly;
                    return this;
                }

                /**
                 * 
                 * @param scale
                 *            矩形框缩放比例，默认为1.0；参照{@link KeywordPositionBuilder#withScale(Float)}
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withScale(Float scale) {
                    this.scale = scale;
                    return this;
                }

                @Deprecated
                public RectanglePositionBuilder withLrx(Integer page) {
                    this.page = page;
                    return this;
                }

                /**
                 * 
                 * @param page
                 *            rectanglePosition矩形框放在文档的哪一页
                 * @return 签名矩形框坐标对象建造器{@link RectanglePositionBuilder}
                 * @since 2.0.0
                 */
                public RectanglePositionBuilder withPage(Integer page) {
                    this.page = page;
                    return this;
                }

                /**
                 * 
                 * @return 签名矩形框坐标对象 {@link RectanglePosition}
                 * @since 2.0.0
                 */
                public RectanglePosition build() {
                    return new RectanglePosition(lrx, lry, ulx, uly, scale, page);
                }
            }

            public Float getLrx() {
                return lrx;
            }

            public void setLrx(Float lrx) {
                this.lrx = lrx;
            }

            public Float getLry() {
                return lry;
            }

            public void setLry(Float lry) {
                this.lry = lry;
            }

            public Float getUlx() {
                return ulx;
            }

            public void setUlx(Float ulx) {
                this.ulx = ulx;
            }

            public Float getUly() {
                return uly;
            }

            public void setUly(Float uly) {
                this.uly = uly;
            }

            public Float getScale() {
                return scale;
            }

            public void setScale(Float scale) {
                this.scale = scale;
            }

            public Integer getPage() {
                return page;
            }

            public void setPage(Integer page) {
                this.page = page;
            }

        }

    }

    public static class Data {
        private SealData sealData;
        private SealData writeData;

        public static DataBuilder build() {
            return new DataBuilder();
        }

        public static class DataBuilder {
            private SealData sealData;
            private SealData writeData;

            public DataBuilder withSealData(SealData sealData) {
                this.sealData = sealData;
                return this;
            }

            public DataBuilder withWriteData(SealData writeData) {
                this.sealData = writeData;
                return this;
            }

            public Data build() {
                return new Data(sealData, writeData);
            }
        }

        public Data() {
        }

        public Data(SealData sealData, SealData writeData) {
            this.sealData = sealData;
            this.writeData = writeData;
        }

        public SealData getSealData() {
            return sealData;
        }

        public void setSealData(SealData sealData) {
            this.sealData = sealData;
        }

        public SealData getWriteData() {
            return writeData;
        }

        public void setWriteData(SealData writeData) {
            this.writeData = writeData;
        }

    }

    public static class SignerInfo {
        private String name;
        private String orgnizationName;
        private String idCardNo;
        private String location;
        private String contact;
        private String reason;

        public static SignerInfoBuilder builder() {
            return new SignerInfoBuilder();
        }

        public SignerInfo() {
        }

        public SignerInfo(String name, String orgnizationName, String idCardNo, String location, String contact,
                String reason) {
            this.name = name;
            this.orgnizationName = orgnizationName;
            this.idCardNo = idCardNo;
            this.location = location;
            this.contact = contact;
            this.reason = reason;
        }

        public static class SignerInfoBuilder {
            private String name;
            private String orgnizationName;
            private String idCardNo;
            private String location;
            private String contact;
            private String reason;

            public SignerInfoBuilder withName(String name) {
                this.name = name;
                return this;
            }

            public SignerInfoBuilder withOrgnizationName(String orgnizationName) {
                this.orgnizationName = orgnizationName;
                return this;
            }

            public SignerInfoBuilder withIdCardNo(String idCardNo) {
                this.idCardNo = idCardNo;
                return this;
            }

            public SignerInfoBuilder withLocation(String location) {
                this.location = location;
                return this;
            }

            public SignerInfoBuilder withContact(String contact) {
                this.contact = contact;
                return this;
            }

            public SignerInfoBuilder withReason(String reason) {
                this.reason = reason;
                return this;
            }

            public SignerInfo build() {
                return new SignerInfo(name, orgnizationName, idCardNo, location, contact, reason);
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOrgnizationName() {
            return orgnizationName;
        }

        public void setOrgnizationName(String orgnizationName) {
            this.orgnizationName = orgnizationName;
        }

        public String getIdCardNo() {
            return idCardNo;
        }

        public void setIdCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
}
