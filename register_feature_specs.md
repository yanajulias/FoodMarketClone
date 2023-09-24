## Story: User requests to register

## BDD Specs

## Register Feature Specs

### Narrative #1

```
As an online user
I want to register account
So I can logged in and see the home screen 
```

#### Scenarios (Acceptance Criteria)

```
Given the user has connectivity
When the user requests to register account
Then the app should register account remotely
And save the session for the user
Then the app should display home screen
```

## Use Cases

### Register Account Remote Use Case

#### Data:
- URL
- User

#### Primary Course (Happy Path):
1. Execute "Register Account" command with above data.
2. System downloads data from the URL.
3. System validates downloaded data.
4. System creates user account from valid data.
5. System delivers user account and navigates to the home screen.

#### No Connectivity – Error Course (Sad Path):
1. System delivers connectivity error.

#### Invalid Data – Error Course (Sad Path):
1. System delivers invalid data error.

#### Not Found – Error Course (Sad Path):
1. System delivers not found error.

#### Internal Server Error – Error Course (Sad Path):
1. System delivers internal server error.

#### Unexpected – Error Course (Sad Path):
1. System delivers unexpected error.

### Save User Account Use Case

#### Data:
- User Account

#### Primary Course (Happy Path):
1. Execute "Save User Account" command with above data.
2. System encodes user account data.
3. System saves user account data.
4. System delivers success message.

#### Save – Error Course (Sad Path):
1. System delivers save error.

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
