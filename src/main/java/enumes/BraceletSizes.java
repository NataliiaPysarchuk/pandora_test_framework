package enumes;

import lombok.Getter;

@Getter
public enum BraceletSizes {
    SMALL("17") {
        public void getShos() {

        }
    },
    MEDIUM("19") {
        public void getShos() {

        }
    },

    LARGE("21") {
        public void getShos() {

        }
    };

    private String size;

    BraceletSizes(String size) {
        this.size = size;
    }

    abstract void getShos();

    public String getShos_() {
        return null;
    }

    ;
}
