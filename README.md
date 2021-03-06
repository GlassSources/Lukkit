Lukkit
======

Lukkit allows developers to create Bukkit plugins quickly and easily using the lua scripting language.

See the project on [Bukkit Dev](http://dev.bukkit.org/bukkit-plugins/lualukkit/).

### What's the point?
 - Lua is a very beginner friendly language
 - It is very quick to make a simple plugin
 - Supports ALL bukkit functions, with more lua-like ways of doing things added frequently
 - Projects added in v1.0-alpha4 allows for more advanced plugins to be made within their own folder

### Examples
More examples can be found in the examples folder on github

Add command /shout to broadcast a message to the server. Bear in mind that at the moment naming a command with a capital letter will stop the command from being deregistered when running /lukkit reload or /lukkit resetenv
```lua
-- Command name, short description, command usage
lukkit.addCommand("shout", "Broadcast a message to the server", "/shout Your message here", function(sender, args)
  broadcast(table.concat(args, " "))
end)
```

Only allow ops to break blocks.
```lua
events.add("blockBreak", function(event)
  if not event:getPlayer():isOp() then
    broadcast(stringOf(format.RED) .. "You are not allowed to break blocks")
    event:setCancelled(true)
  end
end)
```

Register a new plugin called HelloPlugin. This should go in `..plugins/Lukkit/PROJECT_NAME/main.lua`.
```lua
-- lukkit.addPlugin(pluginName, pluginVersion, pluginContent)
local helloPlugin = lukkit.addPlugin("HelloPlugin", "1.0", function(plugin)
  plugin.onEnable(function()
    plugin.print("HelloPlugin v" .. plugin.version .. " enabled")
  end)

  plugin.onDisable(function()
    plugin.warn("HelloPlugin v" .. plugin.version .. " disabled")
  end)

  plugin.addCommand("hello", "Send the sender the message 'Hello, world!'", "/hello", function(sender, args)
    sender:sendMessage("Hello, world!")
  end)
end)
```
