package game;

/**
 * Rozhraní definující metody nutné pro implementaci herního příkazu. Pro každý
 * příkaz, který je možné ve hře použít, existuje třída zajišťující jeho obsluhu.
 * Třída musí implementovat metody definované tímto rozhraním.
 *
 * @author Jan Říha
 * @version ZS-2022, 2022-12-14
 */
public interface ICommand
{
    /**
     * Metoda vrací název herního příkazu. Jedná se o jedno slovo, které hráč
     * používá pro identifikaci herního příkazu na konzoli, např. 'napoveda',
     * 'konec', 'jdi' apod.
     *
     * @return název herního příkazu
     */
    String getName();

    /**
     * Metoda zajišťující provedení herního příkazu. Počet parametrů <i>(očekávaných
     * prvků v poli)</i> je závislý na konkrétním příkazu, např. příkazy 'napoveda'
     * a 'konec' žádné parametry nemají, příkaz pro přesun mezi oblastmi patrně bude
     * mít jeden parametr <i>(cílovou oblast)</i>, příkazy pro obchodování, používání
     * nebo kombinování předmětů mohou mít parametrů více.
     * <p>
     * Metoda musí zkontrolovat parametry <i>(počet, korektnost)</i>, provést změny
     * ve stavu hry a následně vrátit text, který se hráči vypíše na konzoli.
     *
     * @param parameters parametry příkazu <i>(počet závisí na konkrétním příkazu)</i>
     * @return výsledek zpracování <i>(informace pro hráče, které se vypíšou na konzoli)</i>
     */
    String execute(String[] parameters);
}
