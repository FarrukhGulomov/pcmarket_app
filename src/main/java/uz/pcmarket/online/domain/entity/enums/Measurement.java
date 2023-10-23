package uz.pcmarket.online.domain.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Measurement {
    QUANTITY("Quantity", "Количество"),
    KM("Kilometers", "Километры"),
    SM("Centimeters", "Сантиметры"),
    LITER("Liters", "Литры");

    private String translationEn;
    private String getTranslationRu;


}
