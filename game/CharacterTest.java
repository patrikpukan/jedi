/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
package game;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*******************************************************************************
 * Testovací třída {@code CharacterTest} slouží ke komplexnímu otestování
 * třídy {@link CharacterTest}.
 *
 * @author Patrik Pukan
 * @version ZS-2022, 2023-01-15
 */
public class CharacterTest
{
    @Test
    public void isEvil()
    {
        Character Jozef = new Character("Jozef", "Zly Sused", true);
        assertTrue(Jozef.isCharacterAnEnemy());
    }
}
