package monopoly.util;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Property
{
    private String eventSource;
    private Button button;

    private Image question;
    private Image answer;
    private Image graphic;

    private boolean requiresGraphic;
    private boolean calculatorAllowed;

    public Property(String eventSource, Button button, Image question, Image answer, Image graphic, boolean requiresGraphic, boolean calculatorAllowed)
    {
        this.eventSource = eventSource;
        this.button = button;
        this.question = question;
        this.answer = answer;
        this.requiresGraphic = requiresGraphic;
        this.calculatorAllowed = calculatorAllowed;

        if(requiresGraphic)
        {
            this.graphic = graphic;
        }
    }

    public Property(String eventSource, Button button, Image question, Image answer)
    {
        this(eventSource, button, question, answer, null, false, false);
    }

    public String getEventSource()
    {
        return eventSource;
    }

    public boolean hasGraphic()
    {
        return requiresGraphic;
    }

    public boolean isCalculatorAllowed()
    {
        return calculatorAllowed;
    }

    public Image getGraphic()
    {
        if(requiresGraphic)
            return graphic;
        else
            return null;
    }

    public Button getButton()
    {
        return button;
    }

    public Image getQuestion()
    {
        return question;
    }

    public Image getAnswer()
    {
        return answer;
    }
}
