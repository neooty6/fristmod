package com.ayafps.abyssalreign;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.player.*;
import net.minecraft.particle.*;
import net.minecraft.server.world.*;
import net.minecraft.world.*;

package com.ayafps.abyssalreign;
public class VoidLeaperEntity extends AbyssMobEntity { public VoidLeaperEntity(EntityType<? extends PathAwareEntity> t,World w){super(t,w);stats(28,.30,8,32,3);} protected void initGoals(){commonGoals();} public void tick(){super.tick();if(!getWorld().isClient){if(age%70==0&&getTarget()!=null){double dx=getTarget().getX()-getX(),dz=getTarget().getZ()-getZ(),d=Math.max(.1,Math.sqrt(dx*dx+dz*dz));setVelocity(dx/d*.9,.55,dz/d*.9);velocityDirty=true;}}}}
