package character;

import environment.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Robbers extends Character
{
    private boolean IsNoiseMade;
    protected List<String> runActions = new ArrayList<>();
    protected List<String> keepGoingActions = new ArrayList<>();
    protected List<String> stealActions = new ArrayList<>();
    protected List<String> catchActions = new ArrayList<>();
    protected List<String> enterActions = new ArrayList<>();

    public Robbers(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        super(emotionalState, physicalState, name);

    }

    public boolean IsNoiseMade()
    {
        return IsNoiseMade;
    }

    public void SetNoiseMadeBool(boolean noise)
    {
        IsNoiseMade = noise;
    }

    public void Enter()
    {
        PerformAction(this.GenerateAction(enterActions));
        this.SetPhysicalState(PhysicalState.SNEAKING);
    }
    public void Run()
    {
        PerformAction(GenerateAction(runActions));
        this.SetPhysicalState(PhysicalState.RUNNING);
    }

    public void Catch()
    {
        PerformAction(GenerateAction(catchActions));
        this.SetPhysicalState(PhysicalState.RUNNING);
    }

    public void StealItem(Item item)
    {
        PerformAction(GenerateAction(stealActions));
    }

    public void KeepGoing()
    {
       PerformAction(GenerateAction(keepGoingActions));
       this.SetPhysicalState(PhysicalState.SNEAKING);
    }

    public void Whisper()
    {
        PerformAction("Шепот Филле и Рулле раздавался совсем рядом");
    }

    protected void AddEnterActions(String enterAction)
    {
        enterActions.add(enterAction);
    }
    protected void AddRunActions(String runAction)
    {
        runActions.add(runAction);
    }

    protected void AddStealActions(String stealAction)
    {
        stealActions.add(stealAction);
    }

    protected void AddKeepGoingActions(String keepGoingAction)
    {
        keepGoingActions.add(keepGoingAction);
    }

    protected void AddCatchActions(String catchAction)
    {
        catchActions.add(catchAction);
    }

}
