package character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class MainCharacter extends Character
{
    private boolean notiable;
    protected List<String> dreams = new ArrayList<>();
    protected List<String> escapeActions = new ArrayList<>();
    protected List<String> scaryDreams = new ArrayList<>();

    public MainCharacter(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        super(emotionalState, physicalState, name);
    }

    public boolean IsNotiable()
    {
        return notiable;
    }

    public void SetNotiable(boolean notiable)
    {
        this.notiable = notiable;
    }
    protected void AddDream(String dream)
    {
        dreams.add(dream);
    }
    protected void AddScaryDream(String scaryDream)
    {
        scaryDreams.add(scaryDream);
    }

    @Override
    public void PerformAction(String action)
    {
        System.out.print(action + ". ");
    }

    protected void AddEscapeAction(String action)
    {
        escapeActions.add(action);
    }

    public void Think()
    {
        this.PerformAction(GenerateAction(dreams) + ", -- подумал " + this.GetName() + ".");
    }

    public void Escape()
    {
        this.PerformAction(GenerateAction(escapeActions) + ".");
        this.SetPhysicalState(PhysicalState.RUNNING);
        SetNotiable(true);
    }

}
