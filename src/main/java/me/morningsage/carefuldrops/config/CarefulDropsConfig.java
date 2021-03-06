package me.morningsage.carefuldrops.config;

public class CarefulDropsConfig {
    @Config(
            category = "blocks",
            comment = "only work when pressing shift"
    )
    public static boolean isOverrideKeyBind = true;
    @Config(
        category = "blocks",
        comment = "When true, drops from breaking/mining blocks will be placed in the player inventory instead of spawned in the world"
    )
    public static boolean overrideBlockDrops = true;

    @Config(
        category = "entities",
        comment = "When true, drops from killing entities will be placed in the player inventory instead of spawned in the world"
    )
    public static boolean overrideEntityDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on Beehives with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideBeehiveDrops = true;

    @Config(
        category = "shears",
        comment = "When true, right clicking on Mooshrooms with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideMooshroomDrops = false;

    @Config(
        category = "shears",
        comment = "When true, right clicking on pumpkins with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overridePumpkinDrops = true;

    @Config(
        category = "shears",
        comment = "When true, right clicking on sheep with shears places drops in the player inventory instead of spawned in the world"
    )
    public static boolean overrideSheepDrops = false;
}
