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


 ## Payload Contract
 
 ```
 POST /api/login

 Request Body
 {
    "email": "acctesting.yj@gmail.com",
    "password": "testing123"
}

Response Body : 200 Success

{
    "meta": {
        "code": 200,
        "status": "success",
        "message": "Authenticated"
    },
    "data": {
        "access_token": "247|MizzIXckOUBvPWCfBMtJfSSehoVPNKtlChJGn37v",
        "token_type": "Bearer",
        "user": {
            "id": 69,
            "name": "testingyn",
            "email": "acctesting.yj@gmail.com",
            "email_verified_at": null,
            "roles": "USER",
            "current_team_id": null,
            "address": "Jalan Mahoni",
            "houseNumber": "1",
            "phoneNumber": "1",
            "city": "Depok",
            "created_at": 1695459660000,
            "updated_at": 1695459660000,
            "profile_photo_path": null,
            "profile_photo_url": "https://ui-avatars.com/api/?name=testingyn&color=7F9CF5&background=EBF4FF"
        }
    }
}
```
