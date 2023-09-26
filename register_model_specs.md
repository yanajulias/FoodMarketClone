## Model Specs

### RegisterRequest

| Property                | Type     |
|-------------------------|----------|
| `name`                  | `String` |
| `email`                 | `String` |
| `password`              | `String` |
| `password_confirmation` | `String` |
| `address`               | `String` |
| `city`                  | `String` |
| `house_number`          | `String` |
| `phone_number`          | `String` |

### RegisterResponse

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

 ## Payload Contract
 ````
 POST /api/login

 Request Body
{
    "name": "testingjy",
    "email": "acctesting@gmail.com",
    "password": "testingcoba",
    "password_confirmation": "testingcoba",
    "address": "JalanJalan",
    "city": "Depok",
    "houseNumber": "1",
    "phoneNumber": "1"
}

Response Body : 200 Success

{
    "meta": {
        "code": 200,
        "status": "success",
        "message": "User Registered"
    },
    "data": {
        "access_token": "249|IAXdXgdDGikxWX2WazDF6vKIKcoDH5Agq5QWy95K",
        "token_type": "Bearer",
        "user": {
            "id": 125,
            "name": "testingyj",
            "email": "acctesting@gmail.com",
            "email_verified_at": null,
            "roles": "USER",
            "current_team_id": null,
            "address": "JalanJalan",
            "houseNumber": "1",
            "phoneNumber": "1",
            "city": "Depok",
            "created_at": 1695725541000,
            "updated_at": 1695725541000,
            "profile_photo_path": null,
            "profile_photo_url": "https://ui-avatars.com/api/?name=testingyj&color=7F9CF5&background=EBF4FF"
        }
    }
}
```
