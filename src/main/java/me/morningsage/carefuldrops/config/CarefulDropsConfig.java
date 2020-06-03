package me.morningsage.carefuldrops.config;

public class CarefulDropsConfig {
    @Config(
        category = "blocks",
        comment = "When true, drops from breaking/mining blocks will be placed in the player inventory instead of spawned in the world"
    )
    public static boolean overrideBlockDrops = false;

    @Config(
        category = "entities",
        comment = "When true, drops from killing entities will be placed in the player inventory instead of spawned in the world"
    )
    public static boolean overrideEntityDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on Beehives with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideBeehiveDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on Mooshrooms with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideMooshroomDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on pumpkins with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overridePumpkinDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on sheep with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideSheepDrops = true;
}
