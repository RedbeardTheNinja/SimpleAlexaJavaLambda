package com.alexaExamples;

//TODO get lombok working correctly in maven
public class Reprompt {
    public OutputSpeech outputSpeech;

    @java.beans.ConstructorProperties({"outputSpeech"})
    public Reprompt(OutputSpeech outputSpeech) {
        this.outputSpeech = outputSpeech;
    }

    public Reprompt() {
    }

    public OutputSpeech getOutputSpeech() {
        return this.outputSpeech;
    }

    public void setOutputSpeech(OutputSpeech outputSpeech) {
        this.outputSpeech = outputSpeech;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Reprompt)) return false;
        final Reprompt other = (Reprompt) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$outputSpeech = this.outputSpeech;
        final Object other$outputSpeech = other.outputSpeech;
        if (this$outputSpeech == null ? other$outputSpeech != null : !this$outputSpeech.equals(other$outputSpeech))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $outputSpeech = this.outputSpeech;
        result = result * PRIME + ($outputSpeech == null ? 0 : $outputSpeech.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Reprompt;
    }

    public String toString() {
        return "com.magic.pricelookup.Reprompt(outputSpeech=" + this.outputSpeech + ")";
    }
}
