package com.example.parth.geoquiz;

/**
 * Created by parth on 1/13/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        this.mTextResId= textResId;
        this.mAnswerTrue = answerTrue;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
    public int getTextResId() {
        return mTextResId;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
    public boolean getAnswerTrue() {
        return mAnswerTrue;
    }
}
