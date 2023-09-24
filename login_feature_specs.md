## Story: User requests to login

## BDD Specs

## Login Feature Specs

### Narrative #1

```
As an online user
I want to be able to log in to my account
So I can see the home screen and logged in
```

#### Scenarios (Acceptance Criteria)

```
Given the user has connectivity
When the user requests to log in account
Then the app should log in account remotely
And save the session for the user
Then the app should display the home screen
```

## Use Cases

### Login Account Remote Use Case

#### Data:
- URL
- User Account

#### Primary Course (Happy Path):
1. Execute "Login Account" command with above data.
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

### Save Session Use Case

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
