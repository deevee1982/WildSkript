package net.dzikoysk.wildskript.objects.inventory.elements;

import net.dzikoysk.wildskript.objects.inventory.Inventories;

import org.bukkit.event.Event;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.util.Kleenean;

public class EffUnregister extends Effect {
	
	private Expression<String> name;
	
	protected void execute (Event event) {
		
		String name = (String)this.name.getSingle(event);
		if(name == null) return;
		
		Inventories.get(name).unregister();
		
	}
	
	public String toString(Event event, boolean bool) { return "[Inventory] Unregister"; }
	
	@SuppressWarnings("unchecked")
	public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult)
	 {
		this.name = (Expression<String>) expressions[0];
	    return true;
	 }
}









