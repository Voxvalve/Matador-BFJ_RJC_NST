/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matador;

/**
 *
 * @author Nicolai
 */
public class Start extends Field implements IReward {
    
    private int reward;
    
    public Start (String name, Zone zone, int reward)
    {
        super(name, zone);
        this.reward = reward;        
    }
    
    public int getReward()
    {
        return this.reward;
    }
    
}