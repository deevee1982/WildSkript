package net.dzikoysk.wildskript.expressions.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;

public class ExprMaxPlayers extends SimpleExpression<Integer>{

	protected Integer[] get(Event event) {
		int max = Bukkit.getMaxPlayers();
		return new Integer[] { max };
    }

	public boolean isSingle() { 
		return true;
	}

    public Class<? extends Integer> getReturnType() { 
    	return Integer.class;
    }

	public String toString(Event event, boolean b) { 
		return this.getClass().getName();
	}

	public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {    
		return true;
	}
}	
