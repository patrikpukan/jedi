/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
package game;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*******************************************************************************
 * Testovací třída {@code InventoryTest} slouží ke komplexnímu otestování
 * třídy {@link InventoryTest}.
 *
 * @author  Patrik Pukan
 * @version 2023-01-21
 */
public class InventoryTest
{
    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Test
    public void testInventoryhasItem()
    {
        Area area1 = new Area("hala", "Toto je vstupní hala Nové budovy VŠE v Praze.");
        Area area2 = new Area("bufet", "Toto je bufet, v případě nouze zde najdeš pohotovostní zásobu krmiva.");
        Inventory playerInventory = new Inventory("playerInventory");
        Item item2 = new Item("rum", "Láhev vyzrálého rumu.");
        playerInventory.addItem(item2);
        assertTrue(playerInventory.containsItem("rum"));

    }

    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každého testu.
     */
    @Test
    public void tearInventoryHasNotItem()
    {
        Area area1 = new Area("hala", "Toto je vstupní hala Nové budovy VŠE v Praze.");
        Area area2 = new Area("bufet", "Toto je bufet, v případě nouze zde najdeš pohotovostní zásobu krmiva.");
        Inventory playerInventory = new Inventory("playerInventory");
        Item item1 = new Item("stul", "Těžký dubový stůl.", false);
        Item item2 = new Item("rum", "Láhev vyzrálého rumu.");
        assertFalse(playerInventory.containsItem("rum"));
    }

    /***************************************************************************
     * Test, který kontroluje požadovanou funkcionalitu.
     */
    @Test
    public void testInventoryFull()
    {
        Area area1 = new Area("hala", "Toto je vstupní hala Nové budovy VŠE v Praze.");
        Area area2 = new Area("bufet", "Toto je bufet, v případě nouze zde najdeš pohotovostní zásobu krmiva.");
        Inventory playerInventory = new Inventory("playerInventory");
        Item item1 = new Item("stul", "Těžký dubový stůl.");
        Item item2 = new Item("rum", "Láhev vyzrálého rumu.");
        Item item3 = new Item("item3", "item3.");
        Item item4 = new Item("item4", "4Láhev vyzrálého rumu.");
        Item item5 = new Item("item5", "5Láhev vyzrálého rumu.");
        Item item6 = new Item("item6", "6Láhev vyzrálého rumu.");
        playerInventory.addItem(item2);
        playerInventory.addItem(item3);
        playerInventory.addItem(item4);
        playerInventory.addItem(item5);
        playerInventory.addItem(item6);
        playerInventory.addItem(item1);
        assertEquals(5, playerInventory.getSize());
    }
}
