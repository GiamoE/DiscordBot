/*
 * Copyright 2017 github.com/kaaz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package emily.handler.discord;

import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.User;

public class RoleModifyTask {

    private final User user;
    private final Role role;
    private final boolean add;

    public RoleModifyTask(User user, Role role, boolean add) {

        this.user = user;
        this.role = role;
        this.add = add;
    }

    public boolean isAdd() {
        return add;
    }

    public Role getRole() {
        return role;
    }

    public User getUser() {
        return user;
    }
}
