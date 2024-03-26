public class SelToFarangeyt extends BaseConverter{

    @Override
    float convert(float gradus) {
       return (float) (1.8*gradus+32);
    }
}
