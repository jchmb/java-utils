package nl.jchmb.utils.validator;

public class AcceptingValidator<T> implements Validator<T> {
	@Override
	public boolean validate(T object) {
		return true;
	}
}
