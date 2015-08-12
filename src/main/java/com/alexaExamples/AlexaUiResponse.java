package com.alexaExamples;

//TODO get lombok working correctly in maven
public final class AlexaUiResponse {
    private OutputSpeech outputSpeech;
    private Card card;
    private Reprompt reprompt;
    private boolean shouldEndSession = true;

    @java.beans.ConstructorProperties({"outputSpeech", "card", "reprompt", "shouldEndSession"})
    public AlexaUiResponse(OutputSpeech outputSpeech, Card card, Reprompt reprompt, boolean shouldEndSession) {
        this.outputSpeech = outputSpeech;
        this.card = card;
        this.reprompt = reprompt;
        this.shouldEndSession = shouldEndSession;
    }

    public AlexaUiResponse() {
    }

    public OutputSpeech getOutputSpeech() {
        return this.outputSpeech;
    }

    public Card getCard() {
        return this.card;
    }

    public Reprompt getReprompt() {
        return this.reprompt;
    }

    public boolean isShouldEndSession() {
        return this.shouldEndSession;
    }

    public void setOutputSpeech(OutputSpeech outputSpeech) {
        this.outputSpeech = outputSpeech;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setReprompt(Reprompt reprompt) {
        this.reprompt = reprompt;
    }

    public void setShouldEndSession(boolean shouldEndSession) {
        this.shouldEndSession = shouldEndSession;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AlexaUiResponse)) return false;
        final AlexaUiResponse other = (AlexaUiResponse) o;
        final Object this$outputSpeech = this.outputSpeech;
        final Object other$outputSpeech = other.outputSpeech;
        if (this$outputSpeech == null ? other$outputSpeech != null : !this$outputSpeech.equals(other$outputSpeech))
            return false;
        final Object this$card = this.card;
        final Object other$card = other.card;
        if (this$card == null ? other$card != null : !this$card.equals(other$card)) return false;
        final Object this$reprompt = this.reprompt;
        final Object other$reprompt = other.reprompt;
        if (this$reprompt == null ? other$reprompt != null : !this$reprompt.equals(other$reprompt)) return false;
        if (this.shouldEndSession != other.shouldEndSession) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $outputSpeech = this.outputSpeech;
        result = result * PRIME + ($outputSpeech == null ? 0 : $outputSpeech.hashCode());
        final Object $card = this.card;
        result = result * PRIME + ($card == null ? 0 : $card.hashCode());
        final Object $reprompt = this.reprompt;
        result = result * PRIME + ($reprompt == null ? 0 : $reprompt.hashCode());
        result = result * PRIME + (this.shouldEndSession ? 79 : 97);
        return result;
    }

    public String toString() {
        return "com.magic.pricelookup.AlexaUiResponse(outputSpeech=" + this.outputSpeech + ", card=" + this.card + ", reprompt=" + this.reprompt + ", shouldEndSession=" + this.shouldEndSession + ")";
    }
}
