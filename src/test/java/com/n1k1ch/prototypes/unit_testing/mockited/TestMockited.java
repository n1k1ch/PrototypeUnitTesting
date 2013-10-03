package com.n1k1ch.prototypes.unit_testing.mockited;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.n1k1ch.prototypes.unitTesting.mockited.Mockited;

@RunWith(MockitoJUnitRunner.class)
public class TestMockited {

	@Mock
	public Mockited mockited;
	
	@Test
	public void Verify_ZeroInteractions() {
		verifyZeroInteractions(mockited);
	}

	@Test
	public void Verify_ZeroInteractions_On_PreviouslyInteractedObject() {
		verifyZeroInteractions(mockited);
	}
	
	@Test
	public void Verify_One_Interaction() {
		mockited.toVerify();
		
		verify(mockited, times(1)).toVerify();
	}
	
	@Test
	public void Verify_Two_Interactions() {
		mockited.toVerify();
		mockited.toVerify();
		
		verify(mockited, times(2)).toVerify();
	}
	
	@Test
	public void Verify_NoMoreInteractions() {
		mockited.toVerify();
		
		verify(mockited).toVerify();
		
		verifyNoMoreInteractions(mockited);
	}
}
