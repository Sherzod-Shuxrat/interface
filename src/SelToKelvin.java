public class SelToKelvin extends BaseConverter{


    @Override
    float convert(float gradus) {
        return (float) (gradus + 273.15);
    }
}
