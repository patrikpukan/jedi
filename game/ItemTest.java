/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
package game;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*******************************************************************************
 * Testovací třída {@code ItemTest} slouží ke komplexnímu otestování
 * třídy {@link ItemTest}.
 *
 * @author Patrik Pukan
 * @version ZS-2022, 2023-01-15
 */
public class ItemTest
{
    
    @Test
    public void testNewItem()
    {
        Item item1 = new Item("stul", "Těžký dubový stůl.");
        assertEquals("stul", item1.getName());
    }
}
