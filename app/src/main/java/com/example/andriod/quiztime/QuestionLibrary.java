package com.example.andriod.quiztime;


public class QuestionLibrary {

    private String mQuestion[] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun?",
            "This part of the plant attracts bees, butterflies and hummingbirds?",
            "The __________ holds the plant upright",
            ""
    };


    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flowers", "Stem","",""};


    public QuestionLibrary() {
        super();
    }

    public String getmQuestion(int x) {
        String question =mQuestion[x];

        return question;
    }

    public String getmCorrectAnswers(int x) {

        String correctAnswer=mCorrectAnswers[x];
        return correctAnswer;
    }
}
