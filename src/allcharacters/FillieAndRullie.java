package allcharacters;

import character.EmotionalState;
import character.PhysicalState;
import character.Robbers;

public class FillieAndRullie extends Robbers
{
    public FillieAndRullie(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        super(emotionalState, physicalState, name);
        CreateRunActionsList();
        CreateKeepGoingActionsList();
        CreateStealActionsList();
        CreateCatchActionsList();
        CreateEnterActionsList();
    }

    private void CreateRunActionsList()
    {
        this.AddRunActions(GetName() + " внезапно услышали шум и испуганно бросили свои добычу, попытавшись убежать в панике");
        this.AddRunActions("Одно неверное движение заставило грабителей вздрогнуть от страха, и они моментально повернули и побежали в сторону");
        this.AddRunActions("Слышащиеся звуки в темноте заставили грабителей напугаться и торопливо покинуть комнату, не дожидаясь возможного обнаружения");
    }

    private void CreateKeepGoingActionsList()
    {
        this.AddKeepGoingActions("Филле и Рулле на мгновение замедлили шаг, но затем решительно продолжили свое движение");
        this.AddKeepGoingActions("Филле и Рулле на многовение притаились, но вскоре продолжили свой по квартире");
    }

    private void CreateStealActionsList()
    {
        this.AddStealActions(GetName() + " аккуратно складывают в мешок вещь за вещью");
        this.AddStealActions(GetName() + " найденное осторожно кладут в мешок один за другим");
    }
    private void CreateCatchActionsList()
    {
        this.AddCatchActions(GetName() + " бросились в погоню за убегающим, которого вскоре поймали");
        this.AddCatchActions("Они сделали рывок вперед, после чего догнали убегающего");
    }
    private void CreateEnterActionsList()
    {
        this.AddEnterActions(GetName() + " аккуратно вскарабкались по дереву, прилегшему к балкону, и через открытое окно проникли внутрь квартиры");
        this.AddEnterActions(GetName() + " использовали специальный инструмент, чтобы открыть замок на двери и беззвучно проникнуть внутрь квартиры");
    }
}
