package app.krystelbaca.com.happytravel.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by krystelbaca on 3/5/17.
 */

public class OfertasContent {

    public static final List<Oferta> ofertasList = new ArrayList<>();

    public static final Map<String, Oferta> OFERTA_MAP = new HashMap<>();

    private static final int COUNT = ofertasList.size();

    static {
        // Add some sample items.
        addItem(new Oferta("Semana Santa en Cancún",
                            "4 dias y 3 noches en hotel 'La Playita' comidas incluido por 7,800 para dos personas",
                            "1"));

        addItem(new Oferta("Extreme Weekend", "Tour a Barrancas del cobre, transporte y una comida al dia incluido, 1,800 p/persona",
                            "2"));

        addItem(new Oferta("CDMX artistica", "Viaje redondo 2,300 p/persona a CDMX, museo Tamayo y arte moderno gratis",
                            "3"));

        addItem(new Oferta("Fuga a la Huasteca!!!", "1-4 de Abril, hospedaje y tour extremo por las cascadas incluido 5,500 p/persona",
                            "4"));
    }

    private static void addItem(Oferta oferta) {
        ofertasList.add(oferta);
        OFERTA_MAP.put(oferta.getId(), oferta);
    }

    private static app.krystelbaca.com.happytravel.dummy.DummyContent.DummyItem createDummyItem(int position) {
        return new app.krystelbaca.com.happytravel.dummy.DummyContent.DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}


