# BlueSlimeCore (GZ Fork)

Fork of [BlueSlimeCore](https://github.com/SirBlobman/BlueSlimeCore) with Minecraft 26.1 support.

## Changes from upstream

- Replaced private Maven repositories with public alternatives
- Fixed Sonatype OSS repository URLs
- Patched XSeries dependency for 26.1 version support
- Removed FactionsX module (dead project, unavailable dependency)
- Added `26.1` / `26.1.1` to `VersionUtility.getNmsVersion()` mappings
- Fixed `Command.registerCustom()` — added try-catch fallback to Paper command registration when `getCommand()` throws `UnsupportedOperationException` during startup on Paper 26.1

## Prerequisites

- **Java 21** (JDK)
- **XSeries fork** installed in Maven Local (required for 26.1 support)

## Build Instructions

### 1. Build and install patched XSeries

```shell
git clone "https://github.com/Almighty-Satan/XSeries.git" -b feat/support-26.1
cd XSeries
mvn install -DskipTests -Dgpg.skip=true
cd ..
```

This installs the patched XSeries `13.6.0` into your local Maven repository (`~/.m2`).

### 2. Build BlueSlimeCore

```shell
git clone "https://github.com/roggy666/BlueSlimeCoreGZ.git"
cd BlueSlimeCoreGZ
./gradlew build
```

Output jar: `core/build/libs/BlueSlimeCore-*.jar`

## Supported NMS Versions

| NMS Version | Minecraft Version | Status             |
|-------------|-------------------|--------------------|
| 1_8_R3      | 1.8.8             | :x:                |
| 1_12_R1     | 1.12.2            | :x:                |
| 1_16_R3     | 1.16.5            | :x:                |
| 1_17_R1     | 1.17.1            | :x:                |
| 1_18_R2     | 1.18.2            | :x:                |
| 1_19_R3     | 1.19.4            | :white_check_mark: |
| 1_20_R4     | 1.20.6            | :white_check_mark: |
| 1_21_R3     | 1.21.4            | :x:                |
| 1_21_R4     | 1.21.5            | :x:                |
| 1_21_R5     | 1.21.8            | :x:                |
| 1_21_R6     | 1.21.10           | :white_check_mark: |
| 1_21_R7     | 1.21.11           | :white_check_mark: |
| -           | 26.1              | :white_check_mark: |
| -           | 26.1.1            | :white_check_mark: |
