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

    public static class Position {
        private KeywordPosition keywordPosition;
        private RectanglePosition rectanglePosition;
        private String fieldsName;

        public static PositionBuilder builder() {
            return new PositionBuilder();
        }

        public static class PositionBuilder {
            private KeywordPosition keywordPosition;
            private RectanglePosition rectanglePosition;
            private String fieldsName;

            public PositionBuilder withKeywordPosition(KeywordPosition keywordPosition) {
                this.keywordPosition = keywordPosition;
                return this;
            }

            public PositionBuilder withRectanglePosition(RectanglePosition rectanglePosition) {
                this.rectanglePosition = rectanglePosition;
                return this;
            }

            public PositionBuilder withFieldsName(String fieldsName) {
                this.fieldsName = fieldsName;
                return this;
            }

            public Position build() {
                return new Position(keywordPosition, rectanglePosition, fieldsName);
            }
        }

        public Position() {

        }

        public Position(KeywordPosition keywordPosition, RectanglePosition rectanglePosition, String fieldsName) {
            this.keywordPosition = keywordPosition;
            this.rectanglePosition = rectanglePosition;
            this.fieldsName = fieldsName;
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

        public String getFieldsName() {
            return fieldsName;
        }

        public void setFieldsName(String fieldsName) {
            this.fieldsName = fieldsName;
        }

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

            public static KeywordPositionBuilder builder() {
                return new KeywordPositionBuilder();
            }

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

                public KeywordPositionBuilder() {
                }

                public KeywordPositionBuilder withWidth(Float width) {
                    this.width = width;
                    return this;
                }

                public KeywordPositionBuilder withRelativeWidthRatio(Float relativeWidthRatio) {
                    this.relativeWidthRatio = relativeWidthRatio;
                    return this;
                }

                public KeywordPositionBuilder withHeight(Float height) {
                    this.height = height;
                    return this;
                }

                public KeywordPositionBuilder withRelativeHeightRatio(Float relativeHeightRatio) {
                    this.relativeHeightRatio = relativeHeightRatio;
                    return this;
                }

                public KeywordPositionBuilder withDirection(Direction direction) {
                    this.direction = direction;
                    return this;
                }

                public KeywordPositionBuilder withOffset(Float offset) {
                    this.offset = offset;
                    return this;
                }

                public KeywordPositionBuilder withRelativeOffsetRatio(Float relativeOffsetRatio) {
                    this.relativeOffsetRatio = relativeOffsetRatio;
                    return this;
                }

                public KeywordPositionBuilder withKeyword(String keyword) {
                    this.keyword = keyword;
                    return this;
                }

                public KeywordPositionBuilder withScale(Float scale) {
                    this.scale = scale;
                    return this;
                }

                public KeywordPositionBuilder withPages(String pages) {
                    this.pages = pages;
                    return this;
                }

                public KeywordPosition build() {
                    return new KeywordPosition(width, relativeWidthRatio, height, relativeHeightRatio, direction,
                            offset, relativeOffsetRatio, keyword, scale, pages);
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

        }

        public static class RectanglePosition {
            private Float lrx;
            private Float lry;
            private Float ulx;
            private Float uly;
            private Float scale;
            private String pages;

            public static RectanglePositionBuilder builder() {
                return new RectanglePositionBuilder();
            };

            public RectanglePosition() {
            }

            public RectanglePosition(Float lrx, Float lry, Float ulx, Float uly, Float scale, String pages) {
                this.lrx = lrx;
                this.lry = lry;
                this.ulx = ulx;
                this.uly = uly;
                this.scale = scale;
                this.pages = pages;
            }

            static class RectanglePositionBuilder {
                private Float lrx;
                private Float lry;
                private Float ulx;
                private Float uly;
                private Float scale;
                private String pages;

                public RectanglePositionBuilder() {
                }

                public RectanglePositionBuilder withLrx(Float lrx) {
                    this.lrx = lrx;
                    return this;
                }

                public RectanglePositionBuilder withLyx(Float lry) {
                    this.lry = lry;
                    return this;
                }

                public RectanglePositionBuilder withUlx(Float ulx) {
                    this.ulx = ulx;
                    return this;
                }

                public RectanglePositionBuilder withUly(Float uly) {
                    this.uly = uly;
                    return this;
                }

                public RectanglePositionBuilder withScale(Float scale) {
                    this.scale = scale;
                    return this;
                }

                public RectanglePositionBuilder withLrx(String pages) {
                    this.pages = pages;
                    return this;
                }

                public RectanglePosition build() {
                    return new RectanglePosition(lrx, lry, ulx, uly, scale, pages);
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

            public String getPages() {
                return pages;
            }

            public void setPages(String pages) {
                this.pages = pages;
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
