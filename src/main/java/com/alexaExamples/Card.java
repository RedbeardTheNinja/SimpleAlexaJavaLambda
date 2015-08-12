package com.alexaExamples;

//TODO get lombok working correctly in maven
public class Card {
    public String type;
    public String title;
    public String content;

    @java.beans.ConstructorProperties({"type", "title", "content"})
    public Card(String type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }

    public Card() {
    }

    public String getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Card)) return false;
        final Card other = (Card) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.type;
        final Object other$type = other.type;
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$title = this.title;
        final Object other$title = other.title;
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$content = this.content;
        final Object other$content = other.content;
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.type;
        result = result * PRIME + ($type == null ? 0 : $type.hashCode());
        final Object $title = this.title;
        result = result * PRIME + ($title == null ? 0 : $title.hashCode());
        final Object $content = this.content;
        result = result * PRIME + ($content == null ? 0 : $content.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Card;
    }

    public String toString() {
        return "com.magic.pricelookup.Card(type=" + this.type + ", title=" + this.title + ", content=" + this.content + ")";
    }
}
