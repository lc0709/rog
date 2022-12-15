package kr.doiche.rog.item.item;

import kr.doiche.rog.utils.TimeUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class EightBallItem extends Item {

    public EightBallItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient && hand == Hand.MAIN_HAND) {
            sendRandomNumber(user);
            user.getItemCooldownManager().set(this, TimeUtil.SECOND);
        }
        return super.use(world, user, hand);
    }

    private void sendRandomNumber(PlayerEntity player){
        int random = Random.createLocal().nextInt(10);
        player.sendMessage(Text.literal(String.valueOf(random)));
    }
}
