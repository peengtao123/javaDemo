package org;

public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator){
        super(mediator);
    }

    public void someOperation(){
        getMediator().changed(this);
    }
}
