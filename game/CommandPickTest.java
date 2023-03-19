/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
package game;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*******************************************************************************
 * Testovací třída {@code CommandPickTest} slouží ke komplexnímu otestování
 * třídy {@link CommandPickTest}.
 *
 * @author Patrik Pukan
 * @version ZS-2022, 2023-01-15
 */
public class CommandPickTest
{
    private Game game;

    private Item item1;
    private Item item2;

    @BeforeEach
    public void setUp()
    {
        game = new Game();

        Area area1 = new Area("hala", "Toto je vstupní hala Nové budovy VŠE v Praze.");
        Area area2 = new Area("bufet", "Toto je bufet, v případě nouze zde najdeš pohotovostní zásobu krmiva.");

        item1 = new Item("kreslo", "Starožitná polstrovaná sedačka.", false);
        item2 = new Item("rum", "Láhev vyzrálého alkoholu.");
        Inventory playerInventory = new Inventory("playerInventory");

        game.getWorld().setCurrentArea(area1);
    }

    @Test
    public void testIncorrectParameters()
    {
        assertEquals("Tomu nerozumím, musíš mi říct, co mám sebrat.", game.process("vezmi"));
        assertEquals("Tomu nerozumím, neumím sebrat více věcí současně.", game.process("vezmi a b"));
    }
}
