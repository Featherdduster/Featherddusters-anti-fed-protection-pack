package moonshine.core.registry;

import com.tac.guns.item.TransitionalTypes.TimelessAmmoItem;
import com.tac.guns.item.TransitionalTypes.TimelessGunItem;
import moonshine.core.Moonshine;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import moonshine.core.Moonshine;


/**
 * Author: ClumsyAlien, codebase and design based off Mr.Pineapple's original addon
 */
@SuppressWarnings({"NullableProblems", "unused"})
public class ItemRegistry {
	
	// Code saved for later, this is for registering your own attachment attribute to add on to, this one increases accuracy by 25%
	
	//public static final IGunModifier COMPENSATOR_MODIFIER = () -> new IGunModifier() {
	//    public float modifyProjectileSpread(float spread) {
	//        return spread * 0.75F;
	//    }
	//};
	
	
	// Create an object to hold all your items to be registered!
	public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Moonshine.ID);
	/*
		Register each item, your variable name can be whatever you wish, as long as you keep track of your variable name incase you wish to add more functionality to your weapon!

			~~~RegistryObject<GunItem>~~~
		Think of a RegistryObject as a () -> new anything we add on to Minecraft, the <> is what type of something we wish to add!

		For this example I am creating a GunItem! This is from the Crayfish mod, we can reuse the GunItem class to create () -> new Guns for our addon, placing our class type in the <>
		will tell Minecraft to create a () -> new GunItem (<GunItem>), and search of all it's resources!

			~~~ITEM_REGISTRY.register("m1911", () -> () -> new GunItem(() -> new Item.Properties().group(Moonshine.GROUP))~~~
		Now we actually add the item into Minecraft! This will simply tell Minecraft that we expect a () -> new item to be created, the "m1911" string is what I would call, the internal name!

		The internal name is what I call this piece, your internal name is what you will use to define the actual models, and data for your () -> new item!

		(your_internalName).json would be an example for your file name, when creating a GunItem you are required to have both a model defined, and a data file defined!
		Take a look at my project structure, I would recommend you create something very similar, only with replacing "Moonshine" with your own modId!


		() -> () -> new GunItem(() -> new Item.Properties().group(Moonshine.GROUP)));

		The end of our .register(); method is where we actually finish up creating our GunItem! First we use a lambda to create our () -> new GunItem with the bare minimum...

		~~~() -> new GunItem(() -> new Item.Properties().group(Moonshine.GROUP)~~~
		Here we are also saying the GunItem can only be in a stack of 1 (Unstackable) and we can also find it in the creative inventory via our own created Group!

		Now this is where I ClumsyAlien do something tricky and well, hacky, I do not recommend doing this at all and keeping your () -> new GunItem registry looking like this...
		~~~public static final RegistryObject<GunItem> M1911 = ITEM_REGISTRY.register("m1911", () -> () -> new GunItem(() -> new Item.Properties().group(Moonshine.GROUP)));~~~

	------------------------------------------------------------------------------------------------------------------------------- If creating a basic weapon stop here!

		Once you understand the basic concept of adding an item we can talk about adding extra pieces onto our () -> new Item or in this case, GunItem (GunItem implements Item, we have all the same possibilities as an item)
			Here I actually give Minecraft an extra little instruction, for this example when my m1911 gets enchanted, it will not render the enchantment glow no matter what!

			(sticking this right after running our lambda will allow adding methods / overrides without creating our own GunItem! Currently I will use this as development of my own
			GunTypes are not ready, and I only wish to add one extra detail to the current guns)*/

	//public static final RegistryObject<TimelessGunItem> M1894 = ITEM_REGISTRY.register("m1894", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Raiphala_Skh_3= ITEM_REGISTRY.register("raiphala_skh_3", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Raiphala_Skh_2= ITEM_REGISTRY.register("raiphala_skh_2", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Raiphala_Skh_1= ITEM_REGISTRY.register("raiphala_skh_1", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Type3_Mod2= ITEM_REGISTRY.register("type3_mod2", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> light_crossbow_100lbs= ITEM_REGISTRY.register("light_crossbow_100lbs", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> breechloading_arquebus= ITEM_REGISTRY.register("breechloading_arquebus", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> arquebus= ITEM_REGISTRY.register("arquebus", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> type1_mod3= ITEM_REGISTRY.register("type1_mod3", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> type1_mod3c= ITEM_REGISTRY.register("type1_mod3c", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> deanson_conversion= ITEM_REGISTRY.register("deanson_conversion", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> deanson_percussion_revolver= ITEM_REGISTRY.register("deanson_percussion_revolver", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> deanson_conversion_commercial= ITEM_REGISTRY.register("deanson_conversion_commercial", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> trapdoor_rifle= ITEM_REGISTRY.register("trapdoor_rifle", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> trapdoor_sawed_off= ITEM_REGISTRY.register("trapdoor_sawed_off", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> kloblador_carbine= ITEM_REGISTRY.register("kloblador_carbine", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> flintlock_musket= ITEM_REGISTRY.register("flintlock_musket", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> flintlock_blunderbuss= ITEM_REGISTRY.register("flintlock_blunderbuss", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> percussion_rifle= ITEM_REGISTRY.register("percussion_rifle", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> bordoen_pistol= ITEM_REGISTRY.register("bordoen_pistol", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> bordoen_pocket= ITEM_REGISTRY.register("bordoen_pocket", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> bordoen_pocket_s= ITEM_REGISTRY.register("bordoen_pocket_s", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> bordoen_carbine= ITEM_REGISTRY.register("bordoen_carbine", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> bordoen_machine_pistol= ITEM_REGISTRY.register("bordoen_machine_pistol", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Type2_Mod2_s= ITEM_REGISTRY.register("type2_mod2_s", () -> new TimelessGunItem(properties -> properties.group(Moonshine. GROUP)));

	public static final RegistryObject<TimelessGunItem> rolling_block= ITEM_REGISTRY.register("rolling_block", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> skh_1_sawnoff= ITEM_REGISTRY.register("skh_1_sawnoff", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> pinfire_revolver_a= ITEM_REGISTRY.register("pinfire_revolver_a", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> Type2_Mod2= ITEM_REGISTRY.register("type2_mod2", () -> new TimelessGunItem(properties -> properties.group(Moonshine. GROUP)));
	public static final RegistryObject<TimelessGunItem> Type5_Mod2= ITEM_REGISTRY.register("type5_mod2", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> vetterli_carbine= ITEM_REGISTRY.register("vetterli_carbine", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> vetterli_rifle= ITEM_REGISTRY.register("vetterli_rifle", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> vetterli_supressed= ITEM_REGISTRY.register("vetterli_supressed", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> vitali_rifle= ITEM_REGISTRY.register("vitali_rifle", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));

	public static final RegistryObject<TimelessGunItem> shrike_machine_carbine= ITEM_REGISTRY.register("shrike_machine_carbine", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> type1_avtomat= ITEM_REGISTRY.register("type1_avtomat", () -> new TimelessGunItem(properties -> properties.group(Moonshine. GROUP)));
	public static final RegistryObject<TimelessGunItem> type1_mod2c= ITEM_REGISTRY.register("type1_mod2c", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));
	public static final RegistryObject<TimelessGunItem> type1_mod2= ITEM_REGISTRY.register("type1_mod2", () -> new TimelessGunItem(properties -> properties.group(Moonshine.GROUP)));


	public static final RegistryObject<Item> kloblador_41= ITEM_REGISTRY.register("kloblador_41", TimelessAmmoItem::new);
	public static final RegistryObject<Item> round42r_long = ITEM_REGISTRY.register("round42r_long", TimelessAmmoItem::new);
	public static final RegistryObject<Item> round42r_short = ITEM_REGISTRY.register("round42r_short", TimelessAmmoItem::new);
	public static final RegistryObject<Item> round52_60_long = ITEM_REGISTRY.register("round52_60", TimelessAmmoItem::new);
	public static final RegistryObject<Item> roundball_76 = ITEM_REGISTRY.register("roundball_76", TimelessAmmoItem::new);
	public static final RegistryObject<Item> shot_76 = ITEM_REGISTRY.register("shot_76", TimelessAmmoItem::new);
	public static final RegistryObject<Item> paper_52= ITEM_REGISTRY.register("paper_52", TimelessAmmoItem::new);
	public static final RegistryObject<Item> paper_42= ITEM_REGISTRY.register("paper_42", TimelessAmmoItem::new);
	public static final RegistryObject<Item> raiphala_7_6 = ITEM_REGISTRY.register("raiphala_7_6", TimelessAmmoItem::new);
	public static final RegistryObject<Item> bordeon9_2_x23= ITEM_REGISTRY.register("bordeon9_2_x23", TimelessAmmoItem::new);
	public static final RegistryObject<Item> raiphala_10_4= ITEM_REGISTRY.register("raiphala_10_4", TimelessAmmoItem::new);
	public static final RegistryObject<Item> round36_30 = ITEM_REGISTRY.register("round36_30", TimelessAmmoItem::new);


	//public static final RegistryObject<TimelessOldRifleGunItem> M1894 = ITEM_REGISTRY.register("m1894", TimelessOldRifleGunItem::new); TimelessOldRifleGunItem allows the oldScope attachment to be accessible
	//public static final RegistryObject<TimelessPistolGunItem> M1894 = ITEM_REGISTRY.register("m1894", TimelessPistolGunItem::new); TimelessPistolGunItem allows the pistolScope and pistolBarrel to be accessible

	/*public static final RegistryObject<TimelessGunItem> M1911_NETHER = ITEM_REGISTRY.register("m1911_nether", () -> () -> new TimelessGunItem(Properties::isImmuneToFire) {
		public int getItemEnchantability() {
			return 12;
		}
	});*/

	// Here I also create some () -> new Ammunition for my mod! Not a necessary piece as you can continue using the original "tac:" ammo!
	/*public static final RegistryObject<TimelessAmmoItem> MAGNUM_BULLET = ITEM_REGISTRY.register("magnumround", TimelessAmmoItem::new);*/
}