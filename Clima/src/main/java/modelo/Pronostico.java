package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pronostico {
    private float temp;
    @JsonProperty(value = "feels_like")
    private float feelsLike;
    @JsonProperty(value = "temp_min")
    private float tempMin;
    @JsonProperty(value = "temp_max")
    private float tempMax;
    private float pressure;
    private float humidity;
}
