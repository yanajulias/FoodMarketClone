## Model Specs

### LoginRequest

| Property    | Type     |
|-------------|----------|
| `email`     | `String` |
| `password`  | `String` |

### LoginResponse

| Property   | Type     |
|------------|----------|
| `meta`     | `Object` |
| `data`     | `Object` |

##### meta
| Property       | Type     |
|----------------|----------|
| `code`         | `Int`    |
| `status`       | `String` |
| `message`      | `String` |

##### data
| Property       | Type     |
|----------------|----------|
| `access_token` | `String` |
| `token_type`   | `String` |
| `user`         | `Object` |

##### user
| Property            | Type     |
|---------------------|----------|
| `id`                | `Int`    |
| `name`              | `String` |
| `email`             | `String` |
| `email_verified_at` | `String` |
| `roles`             | `String` |
| `current_team_id`   | `String` | 
| `address`           | `String` |
| `house_number`      | `String` |
| `phone_number`      | `String` |
| `city`              | `String` |
| `created_at`        | `Long`   |
| `updated_at`        | `Long`   |
| `profile_photo_path`| `String` |
| `profile_photo_url` | `String` |
