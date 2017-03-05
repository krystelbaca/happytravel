package app.krystelbaca.com.happytravel.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by krystelbaca on 3/5/17.
 */

public class DestinoContent {

    public static final List<Destino> destinoList = new ArrayList<>();

    public static final Map<String, Destino> DESTINOS_MAP = new HashMap<>();

    private static final int COUNT = destinoList.size();

    static {
        // Add some sample items.
        addItem(new Destino("Cancún", "El destino más popular de México, disfruta la Riviera Maya",
                "1"));

        addItem(new Destino("Puerto Vallarta", "Una de las playas más hermosas de nuestro país",
                "2"));

        addItem(new Destino("Mazatlán", "La autentica playa de todo Chihuahua",
                "3"));

        addItem(new Destino("La Paz, Baja California", "Hermosa combinación de playa y desierto",
                "4"));

        addItem(new Destino("San Miguel de Allende", "Uno de los pueblos mágicos mas bellos de México",
                "5"));

        addItem(new Destino("Guanajuato, Gto.", "Conoce la capital del estado de las momias", "6"));

        addItem(new Destino("Riviera Nayarit", "Un nuevo destino que no te puedes perder", "7"));

        addItem(new Destino("San Cristobal de las Casas, Chiapas", "Un hermoso pueblo mágico famoso mundialmente",
                "8"));
    }

    private static void addItem(Destino destino) {
        destinoList.add(destino);
        DESTINOS_MAP.put(destino.getId_destino(), destino);
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
