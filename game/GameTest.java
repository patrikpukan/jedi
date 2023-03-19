package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testovací třída pro komplexní otestování celé hry. Měli byste v ní otestovat
 * všechny herní scénáře <i>(způsoby, kterými lze hru projít a ukončit, ať už
 * výhrou, nebo prohrou)</i>.
 *
 * @author Jan Říha
 * @version ZS-2022, 2022-12-14
 */
public class GameTest
{
    private Game game;

    @BeforeEach
    public void setUp()
    {
        game = new Game();
    }

    @Test
    public void testBasicScenario()
    {
        assertEquals("lod", game.getWorld().getCurrentArea().getName());
        assertTrue(game.getWorld().getCurrentArea().containsItem("lampas"));
        assertFalse(game.isGameOver());

        game.process("vezmi lampas");

        //# TODO: Kontrola, zda je po použití příkazu předmět skutečně v inventáři,
        //# v následujícím komentáři uvádím 'pseudo-kód', jak by to asi mohlo vypadat,
        //# konkrétní implementace ve Vaší hře se ale může lišit na základě toho, jak
        //# si naimplementujete třídu Inventory!
        
        game.process("jdi strom");
        game.process("jdi domcek");
        game.process("poloz lampas");
        game.process("pouzi lampas");
        game.process("vezmi stul");
        assertFalse(game.getWorld().getPlayerInventory().containsItem("stul"));
        assertTrue(game.getWorld().getPlayerInventory().containsItem("blaster"));
        assertFalse(game.getWorld().getPlayerInventory().containsItem("lampas"));
        game.process("jdi strom");
        game.process("jdi dzungla");
        game.process("jdi cistinka");
        game.process("jdi brloh");
        game.process("boj karkash");
        assertTrue(game.getWorld().getPlayerInventory().containsItem("kluc"));
        game.process("jdi cistinka");
        game.process("jdi dzungla");
        game.process("jdi strom");
        assertFalse(game.isGameOver());
        game.process("jdi jazero");
        game.process("pouzi cln");
        assertEquals("jaskyna", game.getWorld().getCurrentArea().getName());
        game.process("jdi chodba");
        game.process("poloz kluc");
        assertFalse(game.isGameOver());
        game.process("pouzi kluc");
        assertEquals("radioveza", game.getWorld().getCurrentArea().getName());
        assertFalse(game.getWorld().getPlayerInventory().containsItem("kluc"));
        game.process("vezmi transmiter");
        assertTrue(game.isGameOver());
    }
}
