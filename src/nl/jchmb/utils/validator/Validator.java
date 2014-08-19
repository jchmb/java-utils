package nl.jchmb.utils.validator;

public interface Validator<T> {
	public boolean validate(T object);
}
