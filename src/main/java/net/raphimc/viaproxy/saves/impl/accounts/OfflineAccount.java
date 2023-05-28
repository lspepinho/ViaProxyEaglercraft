/*
 * This file is part of ViaProxy - https://github.com/RaphiMC/ViaProxy
 * Copyright (C) 2023 RK_01/RaphiMC and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
please don't be homeless
- Mollomm1
*/ 

package net.raphimc.viaproxy.saves.impl.accounts;

import com.google.gson.JsonObject;
import org.apache.http.impl.client.CloseableHttpClient;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class OfflineAccount extends Account {

    private final String name;
    private final UUID uuid;

    public OfflineAccount(JsonObject jsonObject) {
        this.name = "?";
        this.uuid = null;
    }

    public OfflineAccount(final String name) {
        this.name = name;
        this.uuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + null).getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public JsonObject toJson() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "?");
        jsonObject.addProperty("uuid", "?");
        return jsonObject;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public String getDisplayString() {
        return "?" + " (Invalid)";
    }

    @Override
    public void refresh(CloseableHttpClient httpClient) {
    }

}
