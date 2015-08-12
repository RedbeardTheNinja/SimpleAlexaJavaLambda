package com.alexaExamples;

//TODO get lombok working correctly in maven
public class OutputSpeech {
    public String type;
    public String text;

    @java.beans.ConstructorProperties({"type", "text"})
    public OutputSpeech(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public OutputSpeech() {
    }

    public String getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OutputSpeech)) return false;
        final OutputSpeech other = (OutputSpeech) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.type;
        final Object other$type = other.type;
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$text = this.text;
        final Object other$text = other.text;
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.type;
        result = result * PRIME + ($type == null ? 0 : $type.hashCode());
        final Object $text = this.text;
        result = result * PRIME + ($text == null ? 0 : $text.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OutputSpeech;
    }

    public String toString() {
        return "com.magic.pricelookup.OutputSpeech(type=" + this.type + ", text=" + this.text + ")";
    }
}
