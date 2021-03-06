
package unwrittenfun.minecraft.lukkit.environment.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.*;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

import java.util.ArrayList;

/**
 * Bukkit Plugin: Lukkit
 * Author: UnwrittenFun
 */
public class LukkitVehicleEvents implements Listener {
    public LukkitVehicleEvents() {
        LukkitEvents.eventMap.put("vehicleBlockCollision", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleCreate", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleDamage", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleDestroy", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleEnter", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleEntityCollision", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleExit", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleMove", new ArrayList<LuaFunction>());
        LukkitEvents.eventMap.put("vehicleUpdate", new ArrayList<LuaFunction>());
    }

    @EventHandler
    public void vehicleBlockCollision(VehicleBlockCollisionEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleBlockCollision");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void vehicleCreate(VehicleCreateEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleCreate");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void vehicleDamage(VehicleDamageEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleDamage");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void vehicleDestroy(VehicleDestroyEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleDestroy");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void vehicleEnter(VehicleEnterEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleEnter");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void vehicleEntityCollision(VehicleEntityCollisionEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleEntityCollision");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void vehicleExit(VehicleExitEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleExit");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
            if (event.isCancelled()) return;
        }
    }

    @EventHandler
    public void vehicleMove(VehicleMoveEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleMove");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }

    @EventHandler
    public void vehicleUpdate(VehicleUpdateEvent event) {
        ArrayList<LuaFunction> callbacks = LukkitEvents.eventMap.get("vehicleUpdate");
        for (LuaFunction cb : callbacks) {
            cb.call(CoerceJavaToLua.coerce(event));
        }
    }
}